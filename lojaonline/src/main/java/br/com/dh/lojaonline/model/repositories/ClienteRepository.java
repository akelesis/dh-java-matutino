package br.com.dh.lojaonline.model.repositories;


import org.springframework.data.repository.CrudRepository;

import br.com.dh.lojaonline.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
