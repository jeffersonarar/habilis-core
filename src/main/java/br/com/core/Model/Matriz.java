package br.com.core.Model;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.core.Interface.IModel;

@Entity
@Table(name = "matriz")
public class Matriz implements IModel<Integer>{

	private static final long serialVersionUID = 8685246035242524220L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable=true)
	private long id;
	
	@Column(name = "nome", nullable=true)
	private String nome;
	
	@Column(name = "qtd_periodo", nullable=true)
	private long qtd_periodo;
	
	@Column(name = "ativo", nullable=true)
	private boolean ativo;
	
	public Matriz(String nome, long qtd_periodo, boolean ativo) {
		this.nome = nome;
		this.qtd_periodo = qtd_periodo;
		this.ativo = ativo;
	}

	public Matriz() {
		
	}

	@Override
	public String toString() {
		return "Matriz [id=" + id + ", nome=" + nome + ", qtd_periodo="
				+ qtd_periodo + ", ativo=" + ativo + "]";
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public boolean getAtivo() {
		return ativo;
	}
	

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getQtd_periodo() {
		return qtd_periodo;
	}

	public void setQtd_periodo(long qtd_periodo) {
		this.qtd_periodo = qtd_periodo;
	}


	public String getNameClass() {
		return "Matriz";
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
