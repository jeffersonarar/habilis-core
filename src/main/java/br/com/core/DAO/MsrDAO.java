package br.com.core.DAO;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.Interface.IGenericDao;
import br.com.core.Interface.IModel;
import br.com.core.Util.Retorno;

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
	
	public Retorno exists(IModel<?> entidade, String parametro) {
		return dao.exists(entidade,parametro);
	}
	
	public Retorno buscarUsuario(IModel<?> entidade, int cpf, String senha) {
		return dao.buscarUsuario(entidade, cpf, senha);
	}
}
