package br.edu.infnet.rafaeldomenici.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.domain.Roupa;

@SpringBootTest
public class ItemEstoqueTests {
	private ItemEstoque item;
	
	private Roupa roupa = new Roupa(7,"Camisa Polo",'G',150,"Roupa Masculina");
	private final int QUANTIDADE = 4;
	
	@BeforeEach
	void setUp() {
		
		item = new ItemEstoque();
		item.setQuantidade(QUANTIDADE);
		item.setRoupa(roupa);
		
	}
	
	@Test
	void testarValorTotalItem() {
		assertEquals(540, item.calcularTotalItem());
	}
	
	@Test
	void recuperarDados() {
		assertEquals(QUANTIDADE, item.getQuantidade());
		assertEquals(roupa, item.getRoupa());
		
	}
	
	@Test
	void testarConstrutor() {
		ItemEstoque item1 = new ItemEstoque(QUANTIDADE,roupa);
		assertEquals(QUANTIDADE, item1.getQuantidade());
		assertEquals(roupa, item1.getRoupa());
		
		
	}
}
