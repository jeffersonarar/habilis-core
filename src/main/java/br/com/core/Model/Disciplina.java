package br.com.core.Model;

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
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;

import br.com.core.Interface.IModel;

@SuppressWarnings("serial")
@Entity
@Table(name = "disciplina")
public class Disciplina implements IModel<Integer>{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome", nullable=true)
	private String nome;
	
	@Column(name = "carga_horaria_total", nullable=true)
	private Double carga_horaria_total;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "matriz_id", nullable=true)
	private Matriz matriz;
	
	@Column(name = "ativo", nullable=true)
	private boolean ativo;
	
	@Column(name ="periodo")
	private int periodo;

    @Transient
	private Integer qtd;
    
    
	public Disciplina() {
	}

	public Disciplina(String nome, Double carga_horaria_total, Matriz matriz,
			Boolean ativo, int periodo) {
		super();
		this.nome = nome;
		this.carga_horaria_total = carga_horaria_total;
		this.matriz = matriz;
		this.periodo = periodo;
		this.ativo = ativo;
	}



	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome
				+ ", carga_horaria_total=" + carga_horaria_total + ", matriz="
				+ matriz + ", ativo=" + ativo + ", periodo=" + periodo + "]";
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

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getNameClass() {
		return "Disciplina";
	}



	public HashMap<String, String> getCriterios() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<String, String> getForeignKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	
	
}
