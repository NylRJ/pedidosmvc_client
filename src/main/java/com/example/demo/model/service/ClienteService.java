package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.negocio.Cliente;

@Service
public class ClienteService {

	@Autowired
	private RestTemplate rest;
	
	public List<Cliente> obterLista(){
		return (List<Cliente>)rest.getForObject("http://localhost:8080/api/cliente", List.class);	
	}
	
	public void incluir(Cliente cliente) {
		rest.postForEntity("http://localhost:8080/api/cliente", cliente, String.class);		
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8080/api/cliente/{id}", id);		
	}
	
	public RestTemplate getRest() {
		return rest;
	}
	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}
}