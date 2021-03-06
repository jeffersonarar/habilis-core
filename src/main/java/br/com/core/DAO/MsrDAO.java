package br.com.core.DAO;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Model.ContratoEstagio;
import br.com.core.Util.Retorno;

@Scope("singleton")
public class MsrDAO extends GenericDAO{
	
	

	ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"META-INF/spring.xml");
	IGenericDao dao = ctx.getBean("iGenericDao", IGenericDao.class);
	
	public List<IModel<?>> findAll(IModel<?> entidade) {
        return dao.findAll(entidade);
    }
       
    public Retorno save(IModel<?> entidade) {
        return dao.save(entidade);
    }
 
    public Retorno desativar(IModel<?> entidade) {
        return dao.desativar(entidade);
    }
    
    public Retorno ativar(IModel<?> entidade) {
        return dao.ativar(entidade);
    }
    
    public Retorno alterar(IModel<?> entidade) {
        return dao.alterar(entidade);
    }

	public List<IModel<?>> findCriterio(IModel<?> entidade, String parametro, boolean ativo) {
		return dao.findCriterio(entidade,parametro,ativo);
	}
	
	public List<IModel<?>> findCriterioEqual(IModel<?> entidade, String parametro, boolean ativo) {
		return dao.findCriterioEqual(entidade, parametro, ativo);
	}
	
	
	public List<IModel<?>> findCriterioEstagiario(IModel<?> entidade, String parametro, boolean ativo) {
		return dao.findCriterioEstagiario(entidade, parametro, ativo);
	}
	
	public List<IModel<?>> findIdForeigh(IModel<?> entidade, IModel<?> parametro){
		return dao.findIdForeigh(entidade,parametro);
	}
	
	public Retorno exists(IModel<?> entidade, String parametro) {
		return dao.exists(entidade,parametro);
	}
	
	public IModel<?> buscarUsuario(IModel<?> entidade, String cpf, String senha) {
		return dao.buscarUsuario(entidade, cpf, senha);
	}
	
	public IModel<?> buscarUsuarioCPF(IModel<?> entidade, String cpf) {
		return dao.buscarUsuarioCPF(entidade, cpf);
	}
	
	
	public IModel<?> buscarPorId(IModel<?> entidade, long id){
		return dao.buscarPorId(entidade, id);
	}
	
    public IModel<?> buscarUsuarioConfiguracao(IModel<?> entidade, String nome,
			String senha){
    	return dao.buscarUsuarioConfiguracao(entidade, nome, senha);
    }
    
	public List<IModel<?>> criadordeSql(String sql, IModel<?> entidade){
		return dao.criadordeSql(sql, entidade);
	}
	
	public List<IModel<?>> buscarPorAtividades(IModel<?> entidade, long id){
		return dao.buscarPorAtividades(entidade, buscarPorId(new ContratoEstagio(), id));
	}
}
