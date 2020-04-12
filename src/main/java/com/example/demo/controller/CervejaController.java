package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.negocio.Cerveja;
import com.example.demo.model.service.CevejaService;

@Controller
public class CervejaController {

	@Autowired
	private CevejaService service;
	
	@RequestMapping(value = "/cervejas", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("cervejas", service.obterLista());
		
		return "cerveja/lista";
	}
	
	@RequestMapping(value = "/cerveja", method = RequestMethod.GET)
	public String showDetalhe() {
		return "cerveja/detalhe";
	}
	
	@RequestMapping(value = "/cerveja", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Cerveja cerveja
			) {
		
		service.incluir(cerveja);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/cerveja/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public CevejaService getService() {
		return service;
	}
	public void setService(CevejaService service) {
		this.service = service;
	}
}