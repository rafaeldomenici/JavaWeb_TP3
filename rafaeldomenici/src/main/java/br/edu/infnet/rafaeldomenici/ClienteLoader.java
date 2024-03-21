package br.edu.infnet.rafaeldomenici;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.rafaeldomenici.model.domain.Cliente;
import br.edu.infnet.rafaeldomenici.model.domain.Endereco;
import br.edu.infnet.rafaeldomenici.model.service.ClienteService;
import br.edu.infnet.rafaeldomenici.model.service.LocalidadeService;

@Component

public class ClienteLoader implements ApplicationRunner{

	@Autowired
	LocalidadeService localidadeService;
	@Autowired
	ClienteService clienteService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco endereco1 = localidadeService.obterPorCep("31560360");
		clienteService.incluir(new Cliente(22,"João",endereco1,"12345678"));
	}

}
