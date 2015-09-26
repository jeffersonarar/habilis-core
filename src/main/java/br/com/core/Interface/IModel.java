package br.com.core.Interface;

import java.io.Serializable;
import java.util.HashMap;

public interface IModel<Entidade> extends Serializable{
	
	public long getId();
	
	public void setId(long id);

	public boolean getAtivo();
	
	public void setAtivo(boolean ativo);
	
	public String getNameClass();
	
	public HashMap<String, String> getCriterios();
	
	public HashMap<String, String> getForeignKey();
	
}
