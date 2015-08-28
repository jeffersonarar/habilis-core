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
@Table(name = "disciplina")
public class Disciplina implements IModel<Integer>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "carga_horaria_total")
	private Double carga_horaria_total;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "matriz_id")
	private Matriz matriz;
	
	@Column(name = "ativo")
	private boolean ativo;
	

	public Disciplina() {
	}

	public Disciplina(String nome, Double carga_horaria_total, Matriz matriz,
			Boolean ativo) {
		super();
		this.nome = nome;
		this.carga_horaria_total = carga_horaria_total;
		this.matriz = matriz;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome
				+ ", carga_horaria_total=" + carga_horaria_total + ", matriz="
				+ matriz + ", ativo=" + ativo + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getCarga_horaria_total() {
		return carga_horaria_total;
	}

	public void setCarga_horaria_total(Double carga_horaria_total) {
		this.carga_horaria_total = carga_horaria_total;
	}

	public Matriz getMatriz() {
		return matriz;
	}

	public void setMatriz(Matriz matriz) {
		this.matriz = matriz;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNameClass() {
		return "Disciplina";
	}

	
	
}
