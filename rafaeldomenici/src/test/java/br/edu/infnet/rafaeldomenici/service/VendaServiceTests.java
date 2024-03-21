package br.edu.infnet.rafaeldomenici.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.domain.Venda;
import br.edu.infnet.rafaeldomenici.model.service.RoupaService;
import br.edu.infnet.rafaeldomenici.model.service.VendaService;

@SpringBootTest
public class VendaServiceTests {
	
	@Autowired
	private VendaService vendaService;
	
	private Venda venda;
	
	private final int ID = 25;
	
	@BeforeEach
	void setUp() {
		venda = new Venda();
		venda.setCodVenda(ID);
	}
	
	@Test
	void inclusao() {
		
		vendaService.incluir(venda);
		
		assertEquals(venda, vendaService.obter(ID));
	}
	
	@Test
	void exclusao() {
		inclusao();
		
		vendaService.excluir(ID);
		
		assertEquals(null, vendaService.obter(ID));
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(vendaService.obterLista().contains(venda));
	}
}
	
	
