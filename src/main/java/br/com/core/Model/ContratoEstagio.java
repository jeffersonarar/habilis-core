package br.com.core.Model;

import java.util.Date;

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
	@Column(name = "id")
	private long id;
	
	@Column(name = "ativo")
	private boolean ativo;
	
	@Column(name = "data_inicio")
	private Date data_inicio;
	
	@Column(name = "data_fim")
	private Date data_fim;
	
	@Column(name = "nome_supervisor")
	private String nome_supervisor;
	
	@Column(name = "cpf_supervisor")
	private int cpf_supervisor;
	
	@Column(name = "telefone_supervisor")
	private String telefone_supervisor;
	
	@Column(name = "email_supervisor")
	private String email_supervisor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "estagiario_id")
	private Estagiario estagiario;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	public ContratoEstagio() {
	}


	public ContratoEstagio(boolean ativo, Date data_inicio, Date data_fim,
			String nome_supervisor, int cpf_supervisor,
			String telefone_supervisor, String email_supervisor,
			Estagiario estagiario, Empresa empresa) {
		this.ativo = ativo;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.nome_supervisor = nome_supervisor;
		this.cpf_supervisor = cpf_supervisor;
		this.telefone_supervisor = telefone_supervisor;
		this.email_supervisor = email_supervisor;
		this.estagiario = estagiario;
		this.empresa = empresa;
	}

	

	@Override
	public String toString() {
		return "ContratoEstagio [ativo=" + ativo + ", data_inicio="
				+ data_inicio + ", data_fim=" + data_fim + ", nome_supervisor="
				+ nome_supervisor + ", cpf_supervisor=" + cpf_supervisor
				+ ", telefone_supervisor=" + telefone_supervisor
				+ ", email_supervisor=" + email_supervisor + ", estagiario="
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


	public int getCpf_supervisor() {
		return cpf_supervisor;
	}


	public void setCpf_supervisor(int cpf_supervisor) {
		this.cpf_supervisor = cpf_supervisor;
	}


	public String getTelefone_supervisor() {
		return telefone_supervisor;
	}


	public void setTelefone_supervisor(String telefone_supervisor) {
		this.telefone_supervisor = telefone_supervisor;
	}


	public String getEmail_supervisor() {
		return email_supervisor;
	}


	public void setEmail_supervisor(String email_supervisor) {
		this.email_supervisor = email_supervisor;
	}


	public String getNameClass() {
		return "ContratoEstagio";
	}
	
}
