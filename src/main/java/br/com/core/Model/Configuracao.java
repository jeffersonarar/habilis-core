package br.com.core.Model;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.core.Interface.IModel;

@SuppressWarnings("serial")
@Entity
@Table(name = "configuracao")
public class Configuracao implements IModel<Integer>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "qtd_associacao_ativada")
	private int qtd_associacao_ativada;
	
	@Column(name = "nome", nullable=true)
	private String nome;
	
	@Column(name = "senha", nullable=true)
	private String senha;
	
	
	@Column(name = "ativo")
	private boolean ativo;
	

	
	public Configuracao() {
		super();
	}


	public Configuracao(String nome) {
		super();
		this.nome = nome;
	}


	public int getQtd_associacao_ativada() {
		return qtd_associacao_ativada;
	}


	public void setQtd_associacao_ativada(int qtd_associacao_ativada) {
		this.qtd_associacao_ativada = qtd_associacao_ativada;
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


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNameClass() {
		return "Configuracao";
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
