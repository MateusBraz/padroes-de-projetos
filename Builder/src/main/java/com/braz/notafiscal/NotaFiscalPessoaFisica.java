package com.braz.notafiscal;

import com.braz.imposto.ImpostoPessoa;
import com.braz.imposto.ImpostoPessoaFisica;

public class NotaFiscalPessoaFisica extends NotaFiscal {

	@Override
	protected ImpostoPessoa calcularImposto() {
		return new ImpostoPessoaFisica();
	}

}
