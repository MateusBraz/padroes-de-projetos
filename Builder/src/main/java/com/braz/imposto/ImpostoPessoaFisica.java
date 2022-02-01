package com.braz.imposto;

import java.math.BigDecimal;

public class ImpostoPessoaFisica implements ImpostoPessoa {

	public BigDecimal calcular(BigDecimal valor) {
		return valor.multiply(new BigDecimal("0.07"));
	}

}
