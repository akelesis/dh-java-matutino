package br.com.dh.lojaonline.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.lojaonline.model.entities.Telefone;

public interface TelefoneRepository extends CrudRepository<Telefone, Integer> {
	
}
