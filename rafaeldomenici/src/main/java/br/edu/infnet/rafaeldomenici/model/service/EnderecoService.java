package br.edu.infnet.rafaeldomenici.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.rafaeldomenici.model.domain.Endereco;



@Service
public class EnderecoService {

private static Map<Integer,Endereco> enderecos = new HashMap<Integer,Endereco>();
	
	public void incluir(Endereco endereco) {
		enderecos.put(endereco.getId(), endereco);
	}
	
	public void excluir(int id) {
		enderecos.remove(id);
	}
	
	public Collection<Endereco> obterLista(){
		return enderecos.values();
	}
	
	public Endereco obter(int id){
		return enderecos.get(id);
	}
	
}
