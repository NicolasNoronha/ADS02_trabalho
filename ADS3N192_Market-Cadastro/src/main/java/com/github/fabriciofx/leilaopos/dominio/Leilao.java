package com.github.fabriciofx.leilaopos.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private Item item;
	private List<Lance> lances;
	private LocalDate termino;
	private double incremento;

	public Leilao(Item item) {
		this(item, 1.0);
	}

	public Leilao(Item item, double incremento) {
		this(item, LocalDate.now().plusDays(30), incremento);
	}

	public Leilao(Item item, LocalDate termino, double incremento) {
		this.item = item;
		this.incremento = incremento;
		this.lances = new ArrayList<>();
		this.termino = termino;
	}
	
	public void oferta(Lance lance) throws LanceInvalidoException {
		if (lance.data().isAfter(this.termino)) {
			throw new LanceInvalidoException();
		}
		if (!this.lances.isEmpty()) {
			Lance maior = maior();
			if (lance.valor() < maior.valor() + incremento) {
				throw new LanceInvalidoException();
			}
			if (lance.valor() <= maior.valor()) {
				throw new LanceInvalidoException();
			}
		}
		this.lances.add(lance);
	}
	
	public Lance vencedor() {
		return maior();
	}
	
	public Lance maior() {
		Lance maior = lances.get(0);
		for (Lance l : lances) {
			if (l.valor() > maior.valor()) {
				maior = l;
			}
		}
		return maior;
	}
}

	