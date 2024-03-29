package com.github.fabriciofx.leilaopos.dominio;

public class Usuario {
	private String email;
	private String senha;

	public Usuario(String email, String senha) {
		if (email == null || email.isEmpty()) {
			throw new IllegalArgumentException("e-mail inválido");
		}
		if (senha == null || !senha.matches("[0-9]+")) {
			throw new IllegalArgumentException("senha inválida");
		}
		
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
