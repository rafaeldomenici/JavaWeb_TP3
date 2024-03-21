package br.edu.infnet.rafaeldomenici.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.domain.Venda;
import br.edu.infnet.rafaeldomenici.model.service.ItemEstoqueService;
import br.edu.infnet.rafaeldomenici.model.service.VendaService;

@SpringBootTest
public class ItemEstoqueServiceTests {
	
	@Autowired
	private ItemEstoqueService itemEstoqueService;
	
	private ItemEstoque item;
	
	private final int QUANTIDADE = 25;
	private final int ID = 3;
	
	private Roupa roupa = new Roupa(ID,"Camisa Polo",'G',150,"Roupa Masculina");
	
	@BeforeEach
	void setUp() {
		item = new ItemEstoque();
		item.setQuantidade(QUANTIDADE);
		item.setRoupa(roupa);
	}
	
	@Test
	void inclusao() {
		
		itemEstoqueService.incluir(item);
		
		assertEquals(item, itemEstoqueService.obter(ID));
	}
	
	@Test
	void exclusao() {
		inclusao();
		
		itemEstoqueService.excluir(ID);
		
		assertEquals(null, itemEstoqueService.obter(ID));
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(itemEstoqueService.obterLista().contains(item));
	}
}
