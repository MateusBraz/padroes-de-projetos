package com.braz.registro;

import java.util.Date;

public class Mensagem {
	
	private String mensagem;
	private Date data = new Date();
	
	public Mensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Date getData() {
		return data;
	}
	
}
