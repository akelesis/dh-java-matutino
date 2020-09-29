package br.com.dh.lojaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.lojaonline.model.entities.Telefone;
import br.com.dh.lojaonline.model.repositories.TelefoneRepository;

@RestController
@RequestMapping(path = "telefone")
public class TelefoneController {
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@GetMapping
	public Iterable<Telefone> findAllTelefones() {
		return telefoneRepository.findAll();
	}
}
