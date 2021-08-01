package br.com.samuel.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.cursomc.domain.Cliente;
import br.com.samuel.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Optional<Cliente> buscar(Integer id) {
		Optional<Cliente> obj = repository.findById(id);

		if (obj.isEmpty()) {
			throw new ObjectNotFoundException("objeto nao encontrado : " + id);
		}

		return obj;

	}
}
