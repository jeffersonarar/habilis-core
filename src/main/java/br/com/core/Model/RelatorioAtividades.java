package br.com.core.Model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.core.Interface.IModel;

public class RelatorioAtividades implements IModel<Integer>{


	private long id;

	private  String ce_nome_supervisor;
	
	private  String ce_email_supervisor;
	
	private  String ce_cpf_supervisor;
	
	private  String at_nome;

	private String es_matricula;
	
	private String es_nome;
	
	private String es_cpf;
	
	private String co_nome;
	
	private Timestamp ce_data_fim;
	
	private Timestamp ce_data_inicio;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCe_nome_supervisor() {
		return ce_nome_supervisor;
	}

	public void setCe_nome_supervisor(String ce_nome_supervisor) {
		this.ce_nome_supervisor = ce_nome_supervisor;
	}

	public String getCe_email_supervisor() {
		return ce_email_supervisor;
	}

	public void setCe_email_supervisor(String ce_email_supervisor) {
		this.ce_email_supervisor = ce_email_supervisor;
	}

	public String getCe_cpf_supervisor() {
		return ce_cpf_supervisor;
	}

	public void setCe_cpf_supervisor(String ce_cpf_supervisor) {
		this.ce_cpf_supervisor = ce_cpf_supervisor;
	}

	public String getAt_nome() {
		return at_nome;
	}

	public void setAt_nome(String at_nome) {
		this.at_nome = at_nome;
	}

	public String getEs_matricula() {
		return es_matricula;
	}

	public void setEs_matricula(String es_matricula) {
		this.es_matricula = es_matricula;
	}

	public String getEs_nome() {
		return es_nome;
	}

	public void setEs_nome(String es_nome) {
		this.es_nome = es_nome;
	}

	public String getEs_cpf() {
		return es_cpf;
	}

	public void setEs_cpf(String es_cpf) {
		this.es_cpf = es_cpf;
	}

	public String getCo_nome() {
		return co_nome;
	}

	public void setCo_nome(String co_nome) {
		this.co_nome = co_nome;
	}

	public Timestamp getCe_data_fim() {
		return ce_data_fim;
	}

	public void setCe_data_fim(Timestamp ce_data_fim) {
		this.ce_data_fim = ce_data_fim;
	}

	public Timestamp getCe_data_inicio() {
		return ce_data_inicio;
	}

	public void setCe_data_inicio(Timestamp ce_data_inicio) {
		this.ce_data_inicio = ce_data_inicio;
	}

	public String getNameClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<String, String> getCriterios() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<String, String> getForeignKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getAtivo() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAtivo(boolean ativo) {
		// TODO Auto-generated method stub
		
	}

}
