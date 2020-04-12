package com.example.demo.model.negocio;

public class Cachaca extends Produto {

	private String tipo;

	public Cachaca() {
		this.setTipoProduto("Cachaca");
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getTipo());
	}
	
	public Cachaca(String tipo) {
		this();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}