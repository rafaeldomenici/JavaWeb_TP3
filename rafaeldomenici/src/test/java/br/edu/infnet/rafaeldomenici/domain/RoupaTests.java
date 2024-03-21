package br.edu.infnet.rafaeldomenici.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;

@SpringBootTest
public class RoupaTests {
	
	private Roupa roupa;
	private final int ID = 1;
	private final String NOME = "Camisa Polo";
	private final String GENERO = "Roupa Masculina";
	
	@BeforeEach
	void setUp() {
		roupa = new Roupa();
		roupa.setId(ID);
		roupa.setNome(NOME);
		roupa.setGenero(GENERO);
		
	}
	
	@Test
	void roupaTamanhoG() {
		roupa.setValor(150);
		roupa.setTamanho('G');
		assertEquals(135,roupa.valorComDesconto());
	}
	
	@Test
	void roupaTamanhoM() {
		roupa.setValor(150);
		roupa.setTamanho('M');
		assertEquals(142.5,roupa.valorComDesconto());
	}
	
	@Test
	void roupaOutrosTamanhos() {
		roupa.setValor(150);
		roupa.setTamanho('P');
		assertEquals(150,roupa.valorComDesconto());
	}
	
	@Test
	void recuperarDados() {
		assertEquals(ID, roupa.getId());
		assertEquals(NOME, roupa.getNome());
		assertEquals(GENERO, roupa.getGenero());
		assertEquals(0, roupa.getValor());
		assertEquals('\u0000', roupa.getTamanho());
	}
	
	@Test
	void testarToString() {
		String teste = "Roupa [id=" + roupa.getId() + ", nome=" + roupa.getNome() + ", tamanho=" + roupa.getTamanho() + ", valor=" + roupa.getValor() + ", genero="
				+ roupa.getGenero() + "]";
		assertEquals(teste,roupa.toString());
	}
	
	@Test
	void testarConstrutor() {
		Roupa roupa1 = new Roupa(ID,NOME,'\u0000',0,GENERO);
		assertEquals(ID, roupa1.getId());
		assertEquals(NOME, roupa1.getNome());
		assertEquals(GENERO, roupa1.getGenero());
		assertEquals(0, roupa1.getValor());
		assertEquals('\u0000', roupa1.getTamanho());
		
	}

}
