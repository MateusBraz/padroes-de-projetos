package com.braz.registro.console;

import com.braz.logger.Logger;
import com.braz.registro.Registro;

public class LoggerConsole extends Logger{

	@Override
	protected Registro criarRegistro() {
		return new RegistroConsole();
	}

}
