package br.com.core.Model;

import java.util.Date;
import java.util.HashMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.core.Interface.IModel;

@SuppressWarnings("serial")
@Entity
@Table(name = "estagiario_atividade")
public class EstagiarioAtividade implements IModel<Integer>{
	
	
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estagiario_id")
	private Estagiario estagiario;
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "atividade_id")
	private Atividade atividade;
	
	@Column(name = "data")
	private Date data;
	
	public EstagiarioAtividade() {

	}

	public EstagiarioAtividade(Estagiario estagiario, Atividade atividade,
			Date data) {
		this.estagiario = estagiario;
		this.atividade = atividade;
		this.data = data;
	}

	
	@Override
	public String toString() {
		return "EstagiarioAtividade [estagiario=" + estagiario + ", atividade="
				+ atividade + ", data=" + data + "]";
	}


	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}


	public boolean getAtivo() {
		// TODO Auto-generated method stub
		return false;
	}


	public void setAtivo(boolean ativo) {
		// TODO Auto-generated method stub
		
	}


	public Estagiario getEstagiario() {
		return estagiario;
	}


	public void setEstagiario(Estagiario estagiario) {
		this.estagiario = estagiario;
	}


	public Atividade getAtividade() {
		return atividade;
	}


	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	public String getNameClass() {
		return "EstagiarioAtividade";
	}



	public HashMap<String, String> getCriterios() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<String, String> getForeignKey() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
