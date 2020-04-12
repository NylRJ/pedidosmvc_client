package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.negocio.Comanda;

@Service
public class ComandaService {

	@Autowired
	private RestTemplate rest;
	
	public List<Comanda> obterLista(){
		return (List<Comanda>)rest.getForObject("http://localhost:8080/api/comanda", List.class);	
	}
	
	public void incluir(Comanda comanda) {
		rest.postForEntity("http://localhost:8080/api/comanda", comanda, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/comanda/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}