package com.braz.registro.console;

import com.braz.registro.Mensagem;
import com.braz.registro.Registro;

public class RegistroConsole implements Registro {

	public void registrar(Mensagem mensagem) {
		System.out.println(mensagem.getData());
		System.out.println(mensagem.getMensagem());
	}

}
