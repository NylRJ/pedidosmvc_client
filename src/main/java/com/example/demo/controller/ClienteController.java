package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.negocio.Cliente;
import com.example.demo.model.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("clientes", service.obterLista());
		
		return "cliente/lista";
	}
	
	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public String showDetalhe() {
		return "cliente/detalhe";
	}
	
	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Cliente cliente
			) {
		
		service.incluir(cliente);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public ClienteService getService() {
		return service;
	}
	public void setService(ClienteService service) {
		this.service = service;
	}
}