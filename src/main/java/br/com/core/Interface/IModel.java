package br.com.core.Interface;

import java.io.Serializable;

public interface IModel<Entidade> extends Serializable{
	
	public long getId();
	
	public void setId(long id);

	public boolean getAtivo();
	
	public void setAtivo(boolean ativo);
	
	public String getNameClass();
	
}
