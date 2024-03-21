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

import br.edu.infnet.rafaeldomenici.model.domain.Cliente;
import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.service.ClienteService;
import br.edu.infnet.rafaeldomenici.model.service.ItemEstoqueService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente) {
		clienteService.incluir(cliente);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable int id) {
		clienteService.excluir(id);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Cliente> obterLista(){
		return clienteService.obterLista();
	}
	
	@GetMapping(value = "/{id}/listar")
	public Cliente obter(@PathVariable int id){
		return clienteService.obter(id);
	}
	
	

}