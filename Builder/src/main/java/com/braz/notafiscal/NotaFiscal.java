package com.braz.notafiscal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.braz.imposto.ImpostoPessoa;
import com.braz.itemproduto.ItemProduto;

public abstract class NotaFiscal {
	
	private String numero;
	private Date dataEmissao;
	private List<ItemProduto> itensProdutos = new ArrayList<ItemProduto>();
	
	protected abstract ImpostoPessoa calcularImposto(); 
	
	public BigDecimal gerarNota() {
		BigDecimal valorImposto = calcularImposto().calcular(null);
		return null;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
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
