package br.edu.infnet.rafaeldomenici.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.domain.Venda;

@SpringBootTest
public class VendaTests {
	
	private Venda venda;
	private Roupa roupa = new Roupa(7,"Camisa Polo",'G',150,"Roupa Masculina");
	private Roupa roupa2 = new Roupa(8,"Camisa Preta",'G',140,"Roupa Masculina");
	
	private final int CODVENDA = 3;
	private final String FORMAPAGAMENTO = "Cartão de crédito";
	
	@BeforeEach
	void setUp() {
		
		ArrayList<Roupa> roupas = new ArrayList<Roupa>();
		roupas.add(roupa);
		roupas.add(roupa2);
		
		venda = new Venda();
		venda.setCodVenda(CODVENDA);
		venda.setFormaPagamento(FORMAPAGAMENTO);
		venda.setListaRoupas(roupas);
		
		
	}
	
	@Test
	void testarValorTotal() {
		assertEquals(261,venda.calcularValorVenda());
	}
	
	@Test
	void recuperarDados() {
		assertEquals(CODVENDA, venda.getCodVenda());
		assertEquals(FORMAPAGAMENTO, venda.getFormaPagamento());
		assertTrue(venda.getListaRoupas().contains(roupa));
	}
	
	@Test
	void testarAdicionarRoupa() {
		Roupa roupa3 = new Roupa();
		venda.adicionarRoupa(roupa3);
		assertTrue(venda.getListaRoupas().contains(roupa3));
	}
	
	
	
	
	
}
