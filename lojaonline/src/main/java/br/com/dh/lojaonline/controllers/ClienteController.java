package br.com.dh.lojaonline.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.lojaonline.model.entities.Cliente;
import br.com.dh.lojaonline.model.repositories.ClienteRepository;

@RestController
@RequestMapping(path = "cliente")
public class ClienteController {
//	private Database db = new Database();
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public Iterable<Cliente> getClientes() {
		return clienteRepository.findAll();
		//return db.list("clientes");
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getById(@PathVariable int id) {
		return clienteRepository.findById(id);
	}
	
	@GetMapping("/nome")
	public Cliente getByName(@RequestParam String nome) {
		return clienteRepository.findOneByNome(nome);
	}
	
	@GetMapping("/nomelike")
	public List<Cliente> getByNameLike(@RequestParam String nome) {
		return clienteRepository.encontrarNomeParecido(nome);
	}
	
	@PostMapping()
	public Cliente addCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		
		return cliente;
		//db.save("clientes", cliente);
	}
	
	@PutMapping("/{idCliente}")
	public Cliente updateCliente(@PathVariable int idCliente, @RequestBody Cliente dadosCliente) throws Exception{
		Cliente meuCliente = clienteRepository.findById(idCliente)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosCliente.getCpf().isEmpty()) meuCliente.setCpf(dadosCliente.getCpf());
		if(!dadosCliente.getNome().isEmpty()) meuCliente.setNome(dadosCliente.getNome());
		
		clienteRepository.save(meuCliente);
		
		return meuCliente;
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}
	
}
