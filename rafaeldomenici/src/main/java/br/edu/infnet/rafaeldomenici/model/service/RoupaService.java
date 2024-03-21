package br.edu.infnet.rafaeldomenici.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;

@Service
public class RoupaService {
	
	private static Map<Integer,Roupa> roupas = new HashMap<Integer,Roupa>();
	
	public void incluir(Roupa roupa) {
		roupas.put(roupa.getId(), roupa);
	}
	
	public void excluir(int id) {
		roupas.remove(id);
	}
	
	public Collection<Roupa> obterLista(){
		return roupas.values();
	}
	
	public Roupa obter(int id){
		return roupas.get(id);
	}
	
	
}
