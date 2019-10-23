package com.github.fabriciofx.leilaopos.dominio;

public class Item {
	private Usuario vendedor;
	private String descricao;

	public Item(Usuario vendedor, String descricao) {
		this.vendedor = vendedor;
		this.descricao = descricao;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
