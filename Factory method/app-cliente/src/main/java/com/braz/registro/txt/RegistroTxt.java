package com.braz.registro.txt;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.braz.registro.Mensagem;
import com.braz.registro.Registro;

public class RegistroTxt implements Registro {

	public void registrar(Mensagem mensagem) {
		try {
			OutputStream os = new FileOutputStream("D:\\Projetos\\ESTUDO\\log.txt");
	        Writer wr = new OutputStreamWriter(os); 
	        BufferedWriter br = new BufferedWriter(wr);
	        
	        br.write(mensagem.getMensagem());
	        br.newLine();
	        br.write(mensagem.getData().toString());
	        br.close();
		}catch(IOException ex) {
			System.out.println("Ocorreu um erro ao gerar log!");
		}
	}

}
