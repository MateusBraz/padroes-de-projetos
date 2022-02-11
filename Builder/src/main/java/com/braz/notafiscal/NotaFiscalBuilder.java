package com.braz.notafiscal;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.braz.itemproduto.ItemProduto;

public class NotaFiscalBuilder {

	private NotaFiscal notaFiscal;

	public NotaFiscalBuilder notaFiscalPessoaFisicaBuild() {
		this.notaFiscal = new NotaFiscalPessoaFisica();
		return this;
	}

	public NotaFiscalBuilder notaFiscalPessoaJuridicaBuild() {
		this.notaFiscal = new NotaFiscalPessoaJuridica();
		return this;
	}

	public NotaFiscalBuilder data(String dataString) {
		this.notaFiscal.setDataEmissao(converterStringEmDate(dataString));
		return this;
	}

	private Date converterStringEmDate(String date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			return dateFormat.parse(date);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Não foi possível converter a data especificada");
		}
	}

	public NotaFiscalBuilder itemProduto(String nome, Integer quantidade, String valorUnitario) {
		ItemProduto item = new ItemProduto();
		item.setNome(nome);
		item.setQuantidade(quantidade);
		item.setValor(new BigDecimal(valorUnitario));

		this.notaFiscal.getItensProdutos().add(item);
		return this;
	}

	public NotaFiscal builder() {
		return this.notaFiscal;
	}

}
