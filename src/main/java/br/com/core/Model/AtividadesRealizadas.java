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
@Table(name = "atividades_realizadas")
public class AtividadesRealizadas  implements IModel<Integer>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "atividade_id")
	private Atividade atividade;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "conteudo_id")
	private Conteudo conteudo;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "contrato_estagio_id")
	private ContratoEstagio contratoEstagio;
	
	@Column(name = "data_inicio")
	private Date data_inicio;
	
	@Column(name = "data_fim")
	private Date data_fim;
	
	@Column(name = "aprovado")
	private String aprovado;
	
	@Column(name = "data_cadastro")
	private Date data_cadastro;
	
	@Column(name = "ativo")
	private boolean ativo;
	
	

	
	public AtividadesRealizadas() {
	}

	public AtividadesRealizadas(Atividade atividade, Conteudo conteudo,
			ContratoEstagio contratoEstagio, Date data_inicio, Date data_fim,
			String aprovado, Date data_cadastro, boolean ativo) {
		this.atividade = atividade;
		this.conteudo = conteudo;
		this.contratoEstagio = contratoEstagio;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.aprovado = aprovado;
		this.data_cadastro = data_cadastro;
		this.ativo = ativo;
	}
	
	@Override
	public String toString() {
		return "AtividadesRealizadas [id=" + id + ", atividade=" + atividade
				+ ", conteudo=" + conteudo + ", contratoEstagio="
				+ contratoEstagio + ", data_inicio=" + data_inicio
				+ ", data_fim=" + data_fim + ", aprovado=" + aprovado
				+ ", data_cadastro=" + data_cadastro + ", ativo=" + ativo + "]";
	}

	
	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public ContratoEstagio getContratoEstagio() {
		return contratoEstagio;
	}

	public void setContratoEstagio(ContratoEstagio contratoEstagio) {
		this.contratoEstagio = contratoEstagio;
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

	public String getAprovado() {
		return aprovado;
	}

	public void setAprovado(String aprovado) {
		this.aprovado = aprovado;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
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
		return "AtividadesRealizadas";
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
