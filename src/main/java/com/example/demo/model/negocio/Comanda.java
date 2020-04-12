package com.example.demo.model.negocio;

import java.util.List;

public class Comanda {

	private Integer id;
	private String descricao;
	private Cliente cliente;
	private List<Produto> produtos;	
	
	public Comanda() {
	}
	public Comanda(Integer id, String descricao) {
		this();
		this.id = id;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getId(), this.getDescricao());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getcliente() {
		return cliente;
	}
	public void setcliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
