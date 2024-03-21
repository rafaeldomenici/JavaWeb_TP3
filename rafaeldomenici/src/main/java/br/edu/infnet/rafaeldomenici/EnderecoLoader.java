package br.edu.infnet.rafaeldomenici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rafaeldomenici.clients.IEnderecoClient;
import br.edu.infnet.rafaeldomenici.model.domain.Endereco;
import br.edu.infnet.rafaeldomenici.model.service.LocalidadeService;

@Component
public class EnderecoLoader implements ApplicationRunner {
	
	
	@Autowired
	private LocalidadeService localidadeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Endereco endereco1 = localidadeService.obterPorCep("31560370");
		System.out.println(endereco1);
		
	}

}