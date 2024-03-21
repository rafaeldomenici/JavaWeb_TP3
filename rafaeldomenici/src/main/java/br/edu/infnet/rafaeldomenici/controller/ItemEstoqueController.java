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

import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.domain.Venda;
import br.edu.infnet.rafaeldomenici.model.service.ItemEstoqueService;
import br.edu.infnet.rafaeldomenici.model.service.VendaService;

@RestController
@RequestMapping("/api/item")
public class ItemEstoqueController {
	
	@Autowired
	private ItemEstoqueService itemEstoqueService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody ItemEstoque item) {
		itemEstoqueService.incluir(item);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable int id) {
		itemEstoqueService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<ItemEstoque> obterLista(){
		return itemEstoqueService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public ItemEstoque obter(@PathVariable int id){
		return itemEstoqueService.obter(id);
	}
}
