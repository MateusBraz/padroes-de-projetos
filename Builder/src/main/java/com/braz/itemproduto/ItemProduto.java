package com.braz.itemproduto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ItemProduto {

	private long cont = 1;
	private final long numero = cont;
	private String nome;
	private int quantidade;
	private BigDecimal valor;

	public ItemProduto() {
		cont++;
	}

	public BigDecimal calcularValorTotal() {
		BigDecimal precoUnitario = getValor();

		if (precoUnitario == null) {
			precoUnitario = BigDecimal.ZERO;
		}
		
		return precoUnitario.multiply(new BigDecimal(getQuantidade()));
	}

	public long getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
