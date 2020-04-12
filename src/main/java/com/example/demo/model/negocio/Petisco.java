package com.example.demo.model.negocio;

public class Petisco extends Produto {

	private String titulo;

	public Petisco() {
		this.setTipoProduto("Petisco");
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getTitulo());
	}
	
	public Petisco(String titulo) {
		this();
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}