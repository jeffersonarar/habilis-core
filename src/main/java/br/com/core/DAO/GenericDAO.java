package br.com.core.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.core.Enum.TipoMensagem;
import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Model.Configuracao;
import br.com.core.Model.Conteudo;
import br.com.core.Model.ContratoEstagio;
import br.com.core.Model.Disciplina;
import br.com.core.Model.Estagiario;
import br.com.core.Util.Retorno;

@Scope
@Transactional
@Repository(value = "iGenericDao")
public class GenericDAO implements IGenericDao {

	// private final Log log = LogFactory.getLog(ContactDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<IModel<?>> findAll(IModel<?> entidade) {
		return sessionFactory.getCurrentSession()
				.createQuery("from " + entidade.getNameClass()).list();
	}

	public Retorno save(IModel<?> entidade) {

		Retorno ret = new Retorno();

		try {
			entidade.setAtivo(true);
			sessionFactory.getCurrentSession().save(entidade);
			ret = new Retorno(true, entidade.getNameClass()
					+ " salvo com sucesso!", TipoMensagem.SUCESSO);

		} catch (Exception e) {
			ret = new Retorno(false, "Erro ao salvar", TipoMensagem.ERROR);
		}

		return ret;
	}

	public Retorno delete(IModel<?> entidade) {

		Retorno ret = new Retorno();

		try {
			sessionFactory.getCurrentSession().delete(entidade);
			ret = new Retorno(true, entidade.getNameClass()
					+ " exluido com sucesso!", TipoMensagem.SUCESSO);

		} catch (Exception e) {
			ret = new Retorno(false, "Erro ao excluir", TipoMensagem.ERROR);
		}

		return ret;
	}

	public Retorno desativar(IModel<?> entidade) {
		Retorno ret = new Retorno();
		try {
			entidade.setAtivo(false);
			sessionFactory.getCurrentSession().update(entidade);
			ret = new Retorno(true, entidade.getNameClass()
					+ " desativado com sucesso!", TipoMensagem.SUCESSO);

		} catch (Exception e) {
			ret = new Retorno(false, "Erro ao desativar", TipoMensagem.ERROR);
		}
		return ret;
	}

	public Retorno alterar(IModel<?> entidade) {
		Retorno ret = new Retorno();
		try {
			sessionFactory.getCurrentSession().update(entidade);
			ret = new Retorno(true, entidade.getNameClass()
					+ " alterado com sucesso!", TipoMensagem.SUCESSO);

		} catch (Exception e) {
			ret = new Retorno(false, "Erro ao alterar", TipoMensagem.ERROR);
		}
		return ret;
	}

	public Retorno ativar(IModel<?> entidade) {
		Retorno ret = new Retorno();
		try {
			entidade.setAtivo(true);
			sessionFactory.getCurrentSession().update(entidade);
			ret = new Retorno(true, entidade.getNameClass()
					+ " ativado com sucesso!", TipoMensagem.SUCESSO);

		} catch (Exception e) {
			ret = new Retorno(false, "Erro ao ativar", TipoMensagem.ERROR);
		}
		return ret;

	}

	@SuppressWarnings("unchecked")
	public List<IModel<?>> findCriterio(IModel<?> entidade, String parametro,
			boolean ativos) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion nome = Restrictions.like("nome", "%" + parametro + "%");
		Criterion ativo = Restrictions.eq("ativo", ativos);
		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(ativo);
		disjunction.add(nome);
		crit.add(disjunction);
		List results = crit.list();
		return results;
	}

	@SuppressWarnings("unchecked")
	public List<IModel<?>> findIdForeigh(IModel<?> entidade, IModel<?> parametro) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion ativo = Restrictions.eq(parametro.getNameClass()
				.toLowerCase(), parametro);
		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(ativo);
		crit.add(disjunction);
		List results = crit.list();
		return results;
	}

	public Retorno exists(IModel<?> entidade, String parametro) {
		Retorno ret;
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion nome = Restrictions.like("cnpj", "%" + parametro + "%");
		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(nome);
		crit.add(disjunction);
		List results = crit.list();
		results.isEmpty();
		if (results.isEmpty()) {
			ret = new Retorno(false);
		} else {
			ret = new Retorno(true);
		}
		return ret;

	}

	public IModel<?> buscarUsuario(IModel<?> entidade, String cpf, String senha) {

		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion cpf1 = Restrictions.eq("cpf", cpf);
		// Criterion senha1 = Restrictions.eq("senha", senha);
		// LogicalExpression andExp = Restrictions.and(cpf1, senha1);

		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(cpf1);
		// disjunction.add(andExp);
		crit.add(disjunction);
		List<Estagiario> results = crit.list();

		if (results.isEmpty()) {
			entidade = null;
		} else {
			for (Estagiario model : results) {
				if (BCrypt.checkpw(senha, model.getSenha())) {
					entidade = model;
				} else {
					entidade = null;
				}
			}
		}
		return entidade;
	}

	public IModel<?> buscarUsuarioConfiguracao(IModel<?> entidade, String nome,
			String senha) {

		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion cpf1 = Restrictions.eq("nome", nome);
		Criterion senha1 = Restrictions.eq("senha", senha);
		// LogicalExpression andExp = Restrictions.and(cpf1, senha1);

		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(cpf1);
		disjunction.add(senha1);
		crit.add(disjunction);
		List<Configuracao> results = crit.list();

		if (results.isEmpty()) {
			entidade = null;
		} else {
			for (Configuracao model : results) {
				entidade = model;
			}
		}
		return entidade;
	}

	public List<IModel<?>> findCriterioEqual(IModel<?> entidade,
			String parametro, boolean ativo) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion nome = Restrictions.and(Restrictions.eq("nome", parametro),
				Restrictions.eq("ativo", ativo));

		Disjunction disjunction = Restrictions.disjunction();

		disjunction.add(nome);
		crit.add(disjunction);
		List results = crit.list();
		return results;
	}

	public List<IModel<?>> findCriterioEstagiario(IModel<?> entidade,
			String parametro, boolean ativo) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion cpf = Restrictions.and(Restrictions.eq("cpf", parametro),
				Restrictions.eq("ativo", ativo));

		Disjunction disjunction = Restrictions.disjunction();

		disjunction.add(cpf);
		crit.add(disjunction);
		List results = crit.list();
		return results;
	}

	public IModel<?> buscarPorId(IModel<?> entidade, long id) {

		Criteria crit = sessionFactory.getCurrentSession().createCriteria(
				entidade.getClass());
		Criterion idEntidade = Restrictions.eq("id", id);
		Disjunction disjunction = Restrictions.disjunction();
		disjunction.add(idEntidade);
		crit.add(disjunction);
		List<ContratoEstagio> results = crit.list();

		if (results.isEmpty()) {
			entidade = null;
		} else {
			for (ContratoEstagio model : results) {
				entidade = model;
			}
		}
		return entidade;
	}

	@SuppressWarnings("unchecked")
	public List<IModel<?>> criadordeSql(String sql, IModel<?> entidade) {
		List results = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(entidade.getClass()).list();
		return results;
	}

}
