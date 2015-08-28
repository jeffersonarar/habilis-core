package br.com.core.Util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.core.Enum.TipoMensagem;


public class Retorno {

	private Serializable serializable;
	private boolean valid;
	private List<?> list;
	private ArrayList<Mensagem> messages;
	private String mensagem;
	private TipoMensagem tipoMensagem;
	
	
	
	public Retorno() {

	}

	public Retorno(boolean valid){
		this.valid = valid;
	}
	
	public Retorno(boolean valid, String mensagem) {
		super();
		this.valid = valid;
		this.mensagem = mensagem;
	}

	public Retorno(Serializable serializable){
		this.serializable = serializable;
		this.valid = true;
	}
	
	public Retorno(boolean valid, Mensagem message){
		this.valid = valid;
		this.messages.add(message);
	}
	
	public Retorno(boolean valid, List<?> list){
		this.valid = valid;
		this.list = list;
	}
	
	public Retorno(boolean valid, ArrayList<Mensagem> messages){
		this.valid = valid;
		this.messages = messages;
	}
	
	public Retorno(boolean valid, List<?> list, Mensagem message){
		this.valid = valid;
		this.list = list;
		this.messages = new ArrayList<Mensagem>();
		this.messages.add(message);
	}
		
	
	public Retorno(boolean valid, String mensagem, TipoMensagem tipoMensagem) {
		this.valid = valid;
		this.mensagem = mensagem;
		this.tipoMensagem = tipoMensagem;
	}

	public Retorno(boolean valid, List<?> list, ArrayList<Mensagem> messages){
		this.valid = valid;
		this.list = list;
		this.messages = messages;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public ArrayList<Mensagem> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Mensagem> messages) {
		this.messages = messages;
	}
	
	public void addMessage(Mensagem message) {
		if(getMessages() == null){
			this.messages = new ArrayList<Mensagem>();
		}
		this.messages.add(message);
	}

	public Serializable getSerializable() {
		return serializable;
	}

	public void setSerializable(Serializable serializable) {
		this.serializable = serializable;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public TipoMensagem gettipoMensagem() {
		return tipoMensagem;
	}

	public void settipoMensagem(TipoMensagem tipoMensagem) {
		this.tipoMensagem = tipoMensagem;
	}
}
