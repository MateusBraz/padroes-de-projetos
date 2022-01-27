package com.braz.logger;

import com.braz.registro.Mensagem;
import com.braz.registro.Registro;

public abstract class Logger {
	
	protected abstract Registro criarRegistro();
	
	public void log(String mensagem) {
		criarRegistro().registrar(new Mensagem(mensagem));
	}

}
