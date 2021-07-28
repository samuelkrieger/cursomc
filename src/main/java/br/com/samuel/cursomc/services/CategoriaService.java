package br.com.samuel.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.cursomc.domain.Categoria;
import br.com.samuel.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;

	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		if(obj ==null) {
			throw new ObjectNotFoundException("objeto nao encontrado"+id);
		}
		
		return obj;
		
	}
}
