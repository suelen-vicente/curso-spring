package suelen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import suelen.model.Cliente;
import suelen.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	
//	Exemplo de injeção feita pelo construtor
//	@Autowired
//	public ClienteService(ClienteRepository repository) {
//		this.repository = repository;
//	}

	public void salvar(Cliente cliente) {
		validar(cliente);
		repository.salvar(cliente);
	}
	
	public void validar(Cliente cliente) {
		
	}
}
