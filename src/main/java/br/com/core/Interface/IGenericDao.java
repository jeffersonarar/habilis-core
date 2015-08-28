package br.com.core.Interface;

import java.util.List;

import br.com.core.Util.Retorno;


//...import statement

public interface IGenericDao {
    public List<IModel<?>> findAll(IModel<?> entidade);
    public Retorno save(IModel<?> entidade);
    public Retorno delete(IModel<?> entidade);
    public Retorno desativar(IModel<?> entidade);
    public Retorno alterar(IModel<?> entidade);
    public Retorno ativar(IModel<?> entidade);
	public List<IModel<?>> findCriterio(IModel<?> entidade, String parametro, boolean ativo);
	public Retorno exists(IModel<?> entidade, String parametro);
	public Retorno buscarUsuario(IModel<?> entidade, int cpf, String senha);
}