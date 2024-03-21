package br.edu.infnet.rafaeldomenici.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.rafaeldomenici.model.domain.Venda;

@Service
public class VendaService {
	
	private static Map<Integer,Venda> vendas = new HashMap<Integer,Venda>();
	
	public void incluir(Venda venda) {
		vendas.put(venda.getCodVenda(), venda);
	}
	
	public void excluir(int codVenda) {
		vendas.remove(codVenda);
	}
	
	public Collection<Venda> obterLista(){
		return vendas.values();
	}
	
	public Venda obter(int codVenda){
		return vendas.get(codVenda);
	}
}
