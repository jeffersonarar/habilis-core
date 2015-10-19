package br.com.core.Interface;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Scope;

import br.com.core.Util.Retorno;


//...import statement
@Scope
public interface IGenericDao {
    public List<IModel<?>> findAll(IModel<?> entidade);
    public Retorno save(IModel<?> entidade);
    public Retorno delete(IModel<?> entidade);
    public Retorno desativar(IModel<?> entidade);
    public Retorno alterar(IModel<?> entidade);
    public Retorno ativar(IModel<?> entidade);
	public List<IModel<?>> findCriterio(IModel<?> entidade, String parametro, boolean ativo);
	public Retorno exists(IModel<?> entidade, String parametro);
	public IModel<?> buscarUsuario(IModel<?> entidade, String cpf, String senha);
	public List<IModel<?>> findIdForeigh(IModel<?> entidade, IModel<?> parametro);
	public List<IModel<?>> findCriterioEqual(IModel<?> entidade, String parametro, boolean ativo);
	public List<IModel<?>> findCriterioEstagiario(IModel<?> entidade, String parametro, boolean ativo);
}