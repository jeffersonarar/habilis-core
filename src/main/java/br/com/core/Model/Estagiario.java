package br.com.core.Model;

import java.util.HashMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.core.Interface.IModel;

@SuppressWarnings("restriction")
@XmlRootElement
@Entity
@Table(name = "estagiario")
public class Estagiario implements IModel<Integer>{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "cpf")
	private int cpf;
	
	@Column(name = "matricula")
	private int matricula;
	
	@Column(name = "ativo")
	private boolean ativo;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "acesso")
	private boolean acesso;
	
	@Column(name ="periodo")
	private int periodo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="matriz_id") 
	private Matriz matriz;


	public Estagiario(String nome, String email, String telefone, int cpf,
			int matricula, boolean ativo, String senha, boolean acesso,
			Matriz matriz, int periodo) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.matricula = matricula;
		this.ativo = ativo;
		this.senha = senha;
		this.acesso = acesso;
		this.matriz = matriz;
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Estagiario [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", telefone=" + telefone + ", cpf=" + cpf + ", matricula="
				+ matricula + ", ativo=" + ativo + ", senha=" + senha + ", periodo=" + periodo
				+ ", acesso=" + acesso + ", matriz=" + matriz + "]";
	}

	public Estagiario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
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

	public Matriz getMatriz() {
		return matriz;
	}

	public void setMatriz(Matriz matriz) {
		this.matriz = matriz;
	}

	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAcesso() {
		return acesso;
	}

	public void setAcesso(boolean acesso) {
		this.acesso = acesso;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNameClass() {
		return "Estagiario";
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
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
