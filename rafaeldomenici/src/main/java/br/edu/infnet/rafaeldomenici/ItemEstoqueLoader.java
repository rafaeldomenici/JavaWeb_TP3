package br.edu.infnet.rafaeldomenici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rafaeldomenici.model.domain.ItemEstoque;
import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.service.ItemEstoqueService;

@Component
public class ItemEstoqueLoader implements ApplicationRunner{

	
	@Autowired
	ItemEstoqueService itemEstoqueService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ItemEstoque item = new ItemEstoque(5,new Roupa(3,"Camisa Azul",'M',180,"Roupa Masculina"));
		System.out.println(item.getRoupa());
		System.out.println("Quantidade em estoque: "+item.getQuantidade());
		System.out.println("Valor total em estoque referente a este item: "+item.calcularTotalItem()+"\n");
			
		itemEstoqueService.incluir(item);
		
		System.out.println(itemEstoqueService.obter(3));
		
		itemEstoqueService.incluir(new ItemEstoque(4,new Roupa(2,"Vestido Vermelho",'P',180,"Roupa Feminina")));
		
		itemEstoqueService.excluir(3);
		
		System.out.println(itemEstoqueService.obterLista());
		
			
			
	}
		
}
	
