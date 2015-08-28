package br.com.core.DAO;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.core.Enum.TipoMensagem;
import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Util.Mensagem;
import br.com.core.Util.Retorno;



@Transactional
@Repository(value = "iGenericDao")
public class GenericDAO implements IGenericDao {  
	
		
		
	    private final Log log = LogFactory.getLog(ContactDaoImpl.class);
	    @Autowired
	    private SessionFactory sessionFactory;    
	    @SuppressWarnings("unchecked")
		public List<IModel<?>> findAll(IModel<?> entidade) {
	        return sessionFactory.getCurrentSession().createQuery("from "+entidade.getNameClass()).list();
	    }
	       
	    public Retorno save(IModel<?> entidade) {
	    	
	    	Retorno ret = new Retorno();
	    	
	    	try {
	    		entidade.setAtivo(true);
	    		sessionFactory.getCurrentSession().save(entidade);
	    		ret = new Retorno(true, entidade.getNameClass()+" salvo com sucesso!", TipoMensagem.SUCESSO);
	   
			} catch (Exception e) {
				ret = new Retorno(false, "Erro ao salvar", TipoMensagem.ERROR);
			}
	     
	    	return ret;
	    }
	    
	    public Retorno delete(IModel<?> entidade) {
	 
	        Retorno ret = new Retorno();
	    	
	    	try {
	    		sessionFactory.getCurrentSession().delete(entidade);
	    		ret = new Retorno(true, entidade.getNameClass()+" exluido com sucesso!", TipoMensagem.SUCESSO);
	   
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
	    		ret = new Retorno(true, entidade.getNameClass()+" desativado com sucesso!", TipoMensagem.SUCESSO);
	   
			} catch (Exception e) {
				ret = new Retorno(false, "Erro ao desativar", TipoMensagem.ERROR);
			}
	    	return ret;      
	    }
	    
	    public Retorno alterar(IModel<?> entidade) {
	        Retorno ret = new Retorno();
	    	try {
	    		sessionFactory.getCurrentSession().update(entidade);
	    		ret = new Retorno(true, entidade.getNameClass()+" alterado com sucesso!", TipoMensagem.SUCESSO);
	   
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
	    		ret = new Retorno(true, entidade.getNameClass()+" ativado com sucesso!", TipoMensagem.SUCESSO);
	   
			} catch (Exception e) {
				ret = new Retorno(false, "Erro ao ativar", TipoMensagem.ERROR);
			}
	    	return ret;
	        
	        
	    }

		@SuppressWarnings("unchecked")
		public List<IModel<?>> findCriterio(IModel<?> entidade, String parametro, boolean ativos) {
	    		Criteria crit = sessionFactory.getCurrentSession().createCriteria(entidade.getClass());
	    		Criterion nome = Restrictions.like("nome","%"+parametro+"%"); 
	    		Criterion ativo = Restrictions.eq("ativo", ativos); 
	    		Disjunction disjunction = Restrictions.disjunction();
	    		disjunction.add(ativo);
	    		disjunction.add(nome); 
	    		crit.add(disjunction); 
	    		List results = crit.list(); 
	    		return results;
		}

}
