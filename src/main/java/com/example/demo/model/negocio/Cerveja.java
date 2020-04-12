package com.example.demo.model.negocio;

public class Cerveja extends Produto {

	private String nivel;

	public Cerveja() {
		this.setTipoProduto("Cerveja");
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getNivel());
	}
	
	public Cerveja(String nivel) {
		this();
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}