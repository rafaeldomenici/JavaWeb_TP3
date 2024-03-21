package br.edu.infnet.rafaeldomenici.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.domain.Roupa;

@Service
public class ItemEstoqueService {
	
private static Map<Integer,ItemEstoque> itens = new HashMap<Integer,ItemEstoque>();
	
	public void incluir(ItemEstoque item) {
		itens.put(item.getRoupa().getId(), item);
	}
	
	public void excluir(int id) {
		itens.remove(id);
	}
	
	public Collection<ItemEstoque> obterLista(){
		return itens.values();
	}
	
	public ItemEstoque obter(int id){
		return itens.get(id);
	}
}
