package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.negocio.Comanda;
import com.example.demo.model.service.ComandaService;
import com.example.demo.model.service.ProdutoService;

@Controller
public class ComandaController {

	@Autowired
	private ComandaService service;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/comandas", method = RequestMethod.GET)
	public String showLista(
				Model model
			) {
		model.addAttribute("comandas", service.obterLista());
		
		return "comanda/lista";
	}
	
	@RequestMapping(value = "/comanda", method = RequestMethod.GET)
	public String showDetalhe(
				Model model
			) {
		model.addAttribute("produtos", produtoService.obterLista());
		
		return "comanda/detalhe";
	}
	
	@RequestMapping(value = "/comanda", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Comanda comanda
			) {
		
		service.incluir(comanda);
		
		return this.showLista(model);
	}
	
	@RequestMapping(value = "/comanda/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.showLista(model);
	}

	public ComandaService getService() {
		return service;
	}
	public void setService(ComandaService service) {
		this.service = service;
	}
}