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

@Entity
@Table(name = "conteudo")
public class Conteudo implements IModel<Integer>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "ativo")
	private boolean ativo;
	
	@Column(name = "nome")
	private String nome;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "disciplina_id")
	private Disciplina disciplina;
	
	public Conteudo() {

	}

	public Conteudo(boolean ativo, String nome, Disciplina disciplina) {
		this.ativo = ativo;
		this.nome = nome;
		this.disciplina = disciplina;
	}


	@Override
	public String toString() {
		return "Conteudo [id=" + id + ", ativo=" + ativo + ", nome=" + nome
				+ ", disciplina=" + disciplina + "]";
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


	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public String getNameClass() {
		return "Conteudo";
	}
}
