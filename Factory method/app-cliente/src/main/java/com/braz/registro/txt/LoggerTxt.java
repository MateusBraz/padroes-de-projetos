package com.braz.registro.txt;

import com.braz.logger.Logger;
import com.braz.registro.Registro;

public class LoggerTxt extends Logger {
	
	@Override
	protected Registro criarRegistro() {
		return new RegistroTxt();
	}

}
