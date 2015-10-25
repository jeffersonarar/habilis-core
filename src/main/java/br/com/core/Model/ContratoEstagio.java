package br.com.core.Model;

import java.util.Date;
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

import br.com.core.Interface.IModel;


@SuppressWarnings("serial")
@Entity
@Table(name = "contrato_estagio")
public class ContratoEstagio  implements IModel<Integer>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable=true)
	private long id;
	
	@Column(name = "ativo", nullable=true)
	private boolean ativo;
	
	@Column(name = "data_inicio", nullable=true)
	private Date data_inicio;
	
	@Column(name = "data_fim", nullable=true)
	private Date data_fim;
	
	@Column(name = "nome_supervisor", nullable=true)
	private String nome_supervisor;
	
	@Column(name = "cpf_supervisor", nullable=true)
	private String cpf_supervisor;
	
	@Column(name = "email_supervisor", nullable=true)
	private String email_supervisor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estagiario_id", nullable=true)
	private Estagiario estagiario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empresa_id", nullable=true)
	private Empresa empresa;
	
	public ContratoEstagio() {
	}



	
	

	public ContratoEstagio(long id, boolean ativo, Date data_inicio,
			Date data_fim, String nome_supervisor, String cpf_supervisor,
			String email_supervisor, Estagiario estagiario, Empresa empresa) {
		super();
		this.id = id;
		this.ativo = ativo;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.nome_supervisor = nome_supervisor;
		this.cpf_supervisor = cpf_supervisor;
		this.email_supervisor = email_supervisor;
		this.estagiario = estagiario;
		this.empresa = empresa;
	}


	@Override
	public String toString() {
		return "ContratoEstagio [ativo=" + ativo + ", data_inicio="
				+ data_inicio + ", data_fim=" + data_fim + ", nome_supervisor="
				+ nome_supervisor + ", cpf_supervisor=" + cpf_supervisor
				+ ",email_supervisor=" + email_supervisor + ", estagiario="
				+ estagiario + ", empresa=" + empresa + "]";
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
	
	
	
	public Date getData_inicio() {
		return data_inicio;
	}


	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}


	public Date getData_fim() {
		return data_fim;
	}


	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}


	public String getNome_supervisor() {
		return nome_supervisor;
	}


	public void setNome_supervisor(String nome_supervisor) {
		this.nome_supervisor = nome_supervisor;
	}
	
	public String getCpf_supervisor() {
		return cpf_supervisor;
	}


	public void setCpf_supervisor(String cpf_supervisor) {
		this.cpf_supervisor = cpf_supervisor;
	}




	public String getEmail_supervisor() {
		return email_supervisor;
	}


	public void setEmail_supervisor(String email_supervisor) {
		this.email_supervisor = email_supervisor;
	}


	public Estagiario getEstagiario() {
		return estagiario;
	}


	public void setEstagiario(Estagiario estagiario) {
		this.estagiario = estagiario;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public String getNameClass() {
		return "ContratoEstagio";
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
