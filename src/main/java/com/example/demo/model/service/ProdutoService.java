package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.negocio.Produto;

@Service
public class ProdutoService {

	@Autowired
	private RestTemplate rest;
	
	public List<Produto> obterLista(){
		return (List<Produto>)rest.getForObject("http://localhost:8080/api/produto", List.class);	
	}
	
	public void incluir(Produto produto) {
		rest.postForEntity("http://localhost:8080/api/produto", produto, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/produto/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}