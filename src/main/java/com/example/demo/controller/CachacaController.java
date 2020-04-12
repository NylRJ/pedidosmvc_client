package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.negocio.Cachaca;
import com.example.demo.model.service.CachacaService;

@Controller
public class CachacaController {

	@Autowired
	private CachacaService service;
	
	@RequestMapping(value = "/cachacas", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("cachacas", service.obterLista());
		
		return "cachaca/lista";
	}
	
	@RequestMapping(value = "/cachaca", method = RequestMethod.GET)
	public String showDetalhe() {
		return "cachaca/detalhe";
	}
	
	@RequestMapping(value = "/cachaca", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Cachaca revista
			) {
		
		service.incluir(revista);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/cachaca/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public CachacaService getService() {
		return service;
	}
	public void setService(CachacaService service) {
		this.service = service;
	}
}