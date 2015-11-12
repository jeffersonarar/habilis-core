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

@Entity
@Table(name = "conteudo")
public class Conteudo implements IModel<Integer>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable=true)
	private long id;
	
	@Column(name = "ativo", nullable=true)
	private boolean ativo;
	
	@Column(name = "nome", nullable=true)
	private String nome;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "disciplina_id", nullable=true)
	private Disciplina disciplina;
	

    @Transient
	private Integer qtd;
    
    @Transient
    private String d_nome;
	
	
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

	public String getD_nome() {
		return d_nome;
	}

	public void setD_nome(String d_nome) {
		this.d_nome = d_nome;
	}
	
	
}
