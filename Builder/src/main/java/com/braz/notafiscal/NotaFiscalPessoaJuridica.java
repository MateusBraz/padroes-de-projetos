package com.braz.notafiscal;

import com.braz.imposto.ImpostoPessoa;
import com.braz.imposto.ImpostoPessoaJuridica;

public class NotaFiscalPessoaJuridica extends NotaFiscal {

	@Override
	protected ImpostoPessoa calcularImposto() {
		return new ImpostoPessoaJuridica();
	}

}
