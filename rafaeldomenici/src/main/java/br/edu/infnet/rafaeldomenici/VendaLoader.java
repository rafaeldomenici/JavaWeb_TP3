package br.edu.infnet.rafaeldomenici;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rafaeldomenici.model.domain.Roupa;
import br.edu.infnet.rafaeldomenici.model.domain.Venda;
import br.edu.infnet.rafaeldomenici.model.service.VendaService;

@Component
public class VendaLoader implements ApplicationRunner{
	
	@Autowired
	VendaService vendaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
	
		
		Roupa roupa1 = new Roupa(3,"Camisa Azul",'M',160,"Roupa Masculina");
		Roupa roupa2 = new Roupa(2,"Camisa Azul",'M',180,"Roupa Masculina");
		ArrayList<Roupa> roupas = new ArrayList<Roupa>();
		
		roupas.add(roupa1);
		roupas.add(roupa2);
		
		Venda venda1 = new Venda(27,"Cartão de crédito",roupas);
		
		System.out.println("ID: "+venda1.getCodVenda()+" Forma de pagamento: "+venda1.getFormaPagamento());
		System.out.println("Roupas vendidas");
		for(Roupa r : venda1.getListaRoupas()) {
			System.out.println(r);
		}
		System.out.println("Valor total da venda: "+venda1.calcularValorVenda()+"\n");
		
		vendaService.incluir(venda1);
		
		System.out.println(vendaService.obter(27));
		
		
		
		System.out.println(vendaService.obterLista());
		
		
		
	}

}
