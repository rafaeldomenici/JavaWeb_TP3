package br.edu.infnet.rafaeldomenici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.service.RoupaService;




@Component
public class RoupaLoader implements ApplicationRunner{
	
	@Autowired 
	RoupaService roupaService;
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
				//Roupas com tamanho G têm um desconto de 10% em seu valor
				Roupa roupa1 = new Roupa();
				roupa1.setId(1);
				roupa1.setNome("Camisa Polo");
				roupa1.setTamanho('G');
				roupa1.setValor(120);
				roupa1.setGenero("Roupa Masculina");
				System.out.println(roupa1+" Valor com desconto: "+roupa1.valorComDesconto());
				
				//Roupas com tamanho M têm um desconto de 5% em seu valor
				Roupa roupa2 = new Roupa();
				roupa2.setId(2);
				roupa2.setNome("Camiseta Branca");
				roupa2.setTamanho('M');
				roupa2.setValor(150);
				roupa2.setGenero("Roupa Masculina");
				System.out.println(roupa2+" Valor com desconto: "+roupa2.valorComDesconto());
				
				//Roupas que não sejam do tamanho G ou M não terão desconto
				Roupa roupa3 = new Roupa();
				roupa3.setId(3);
				roupa3.setNome("Vestido Vermelho");
				roupa3.setTamanho('P');
				roupa3.setValor(170);
				roupa3.setGenero("Roupa Feminina");
				System.out.println(roupa3+" Valor com desconto: "+roupa3.valorComDesconto()+"\n");
				
				roupaService.incluir(roupa1);
				
				roupaService.incluir(roupa2);
				
				roupaService.excluir(1);
				
				System.out.println(roupaService.obter(2));
				
				roupaService.incluir(roupa3);
				
				System.out.println(roupaService.obterLista());
				
				System.out.println("");
				
		
	}

}
