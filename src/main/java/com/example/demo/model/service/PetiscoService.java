package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.negocio.Petisco;

@Service
public class PetiscoService {

	@Autowired
	private RestTemplate rest;
	
	public List<Petisco> obterLista(){
		return (List<Petisco>)rest.getForObject("http://localhost:8080/api/petisco", List.class);	
	}
	
	public void incluir(Petisco petisco) {
		rest.postForEntity("http://localhost:8080/api/petisco", petisco, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/petisco/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}