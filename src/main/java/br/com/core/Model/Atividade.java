package br.com.core.Model;

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
import javax.persistence.Table;

import br.com.core.Interface.IModel;


@SuppressWarnings("serial")
@Entity
@Table(name = "atividade")
public class Atividade  implements IModel<Integer>{

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
	
	@Column(name = "aprovado")
	private boolean aprovado;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="categoria_id")
	private Categoria categoria;
       
	public Atividade() {
		super();
	}

	public Atividade(boolean ativo, String nome, String descricao,
			boolean aprovado, Categoria categoria) {
		super();
		this.ativo = ativo;
		this.nome = nome;
		this.descricao = descricao;
		this.aprovado = aprovado;
		this.categoria = categoria;
	}

	
	@Override
	public String toString() {
		return "Atividade [id=" + id + ", ativo=" + ativo + ", nome=" + nome
				+ ", descricao=" + descricao + ", aprovado=" + aprovado
				+ ", categoria=" + categoria + "]";
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
	
	public String getNameClass() {
		return "Atividade";
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


	public boolean getAprovado() {
		return aprovado;
	}


	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
