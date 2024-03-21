package br.edu.infnet.rafaeldomenici.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.service.RoupaService;

@SpringBootTest
public class RoupaServiceTests {
	
	@Autowired
	private RoupaService roupaService;
	
	private Roupa roupa;
	
	private final int ID = 25;
	
	@BeforeEach
	void setUp() {
		roupa = new Roupa();
		roupa.setId(ID);
	}
	
	@Test
	void inclusao() {
		
		roupaService.incluir(roupa);
		
		assertEquals(roupa, roupaService.obter(ID));
	}
	
	@Test
	void exclusao() {
		inclusao();
		
		roupaService.excluir(ID);
		
		assertEquals(null, roupaService.obter(ID));
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(roupaService.obterLista().contains(roupa));
	}
}
	

