package br.com.core.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.core.Interface.IModel;

@Entity
@Table(name = "empresa")
public class Empresa implements IModel<Integer>{

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")	
	private long id;
    
    @Column(name = "codigo_empresa")
    private String codigo_atividade_empresa;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cnpj")
    private Integer cnpj;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "telefone")
    private String telefone;
    
	@Column(name = "ativo")
	private boolean ativo;
	
	public Empresa(String codigo_empresa, String nome, Integer cnpj, String email,
			String telefone, boolean ativo) {
		super();
		this.codigo_atividade_empresa = codigo_empresa;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
		this.ativo = ativo;
	}

	public Empresa() {
	}

	public String toString() {
		return "Empresa [id=" + id + ", codigo_empresa=" + codigo_atividade_empresa
				+ ", nome=" + nome + ", cnpj=" + cnpj + ", email=" + email
				+ ", telefone=" + telefone + ", ativo=" + ativo + "]";
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

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getNameClass() {
		return "Empresa";
	}

	
	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodigo_atividade_empresa() {
		return codigo_atividade_empresa;
	}

	public void setCodigo_atividade_empresa(String codigo_atividade_empresa) {
		this.codigo_atividade_empresa = codigo_atividade_empresa;
	}
	

}
