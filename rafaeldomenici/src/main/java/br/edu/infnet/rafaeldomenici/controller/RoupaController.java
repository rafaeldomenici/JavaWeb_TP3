package br.edu.infnet.rafaeldomenici.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.service.RoupaService;

@RestController
@RequestMapping("/api/roupa")
public class RoupaController {
	
	@Autowired
	private RoupaService roupaService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Roupa roupa) {
		roupaService.incluir(roupa);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable int id) {
		roupaService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Roupa> obterLista(){
		return roupaService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public Roupa obter(@PathVariable int id){
		return roupaService.obter(id);
	}

}
