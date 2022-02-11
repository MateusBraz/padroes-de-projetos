package com.braz.notafiscal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.braz.imposto.ImpostoPessoa;
import com.braz.itemproduto.ItemProduto;

public abstract class NotaFiscal {

	private long cont = 1;
	private final long numero = cont;
	private Date dataEmissao;
	private List<ItemProduto> itensProdutos = new ArrayList<ItemProduto>();

	protected abstract ImpostoPessoa calcularImposto();

	public NotaFiscal() {
		cont++;
	}

	public void gerarNota() {
		BigDecimal valorTotalItens = getValorTotalItens();
		BigDecimal valorImposto = calcularImposto().calcular(valorTotalItens);
		System.out.println(String.format("VALOR TOTAL ITENS PRODUTOS: R$ %f", valorTotalItens));
		System.out.println(String.format("VALOR IMPOSTO: R$ %f", valorImposto));
		System.out.println(String.format("VALOR TOTAL: R$ %f", valorTotalItens.add(valorImposto)));
	}

	public BigDecimal getValorTotalItens() {
		BigDecimal valorTotalItens = getItensProdutos().stream().map(item -> item.calcularValorTotal())
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		return valorTotalItens;
	}

	public long getNumero() {
		return numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemProduto> getItensProdutos() {
		return itensProdutos;
	}

	public void setItensProdutos(List<ItemProduto> itensProdutos) {
		this.itensProdutos = itensProdutos;
	}

}
