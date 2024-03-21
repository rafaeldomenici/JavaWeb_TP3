package br.edu.infnet.rafaeldomenici.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.rafaeldomenici.clients.IEnderecoClient;
import br.edu.infnet.rafaeldomenici.model.domain.Endereco;

@Service
public class LocalidadeService {

	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
}
