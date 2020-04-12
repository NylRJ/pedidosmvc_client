package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.negocio.Cerveja;

@Service
public class CevejaService {

	@Autowired
	private RestTemplate rest;
	
	public List<Cerveja> obterLista(){
		return (List<Cerveja>)rest.getForObject("http://localhost:8080/api/cerveja", List.class);	
	}
	
	public void incluir(Cerveja cerveja) {
		rest.postForEntity("http://localhost:8080/api/cerveja", cerveja, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/cerveja/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}