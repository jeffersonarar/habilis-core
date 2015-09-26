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
@Table(name = "categoria")
public class Categoria implements IModel<Integer> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "ativo")
	private boolean ativo;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	
	public Categoria() {

	}

	public Categoria(boolean ativo, String nome, String descricao) {
		this.ativo = ativo;
		this.nome = nome;
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Categoria [id=" + id + ", ativo=" + ativo + ", nome=" + nome
				+ ", descricao=" + descricao + "]";
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


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getNameClass() {
		return "Categoria";
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
