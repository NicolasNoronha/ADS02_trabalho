package com.github.fabriciofx.leilaopos.dominio;

import java.time.LocalDate;

public class Lance {
	private Usuario comprador;
	private double valor;
	private LocalDate data;

	public Lance(Usuario comprador, double valor) {
		this(comprador, LocalDate.now(), valor);
	}

	public Lance(Usuario comprador, LocalDate data, double valor) {
		this.comprador = comprador;
		this.valor = valor;
		this.data = data;
	}
	
	public Usuario comprador() {
		return this.comprador;
	}

	public double valor() {
		return valor;
	}

	public LocalDate data() {
		return this.data;
	}
}
