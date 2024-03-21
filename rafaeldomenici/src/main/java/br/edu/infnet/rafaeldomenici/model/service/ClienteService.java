package br.edu.infnet.rafaeldomenici.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.rafaeldomenici.model.domain.Cliente;



@Service
public class ClienteService {
	
private static Map<Integer,Cliente> clientes = new HashMap<Integer,Cliente>();
	
	public void incluir(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}
	
	public void excluir(int id) {
		clientes.remove(id);
	}
	
	public Collection<Cliente> obterLista(){
		return clientes.values();
	}
	
	public Cliente obter(int id){
		return clientes.get(id);
	}
}
