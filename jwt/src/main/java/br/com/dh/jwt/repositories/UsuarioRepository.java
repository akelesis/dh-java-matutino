package br.com.dh.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dh.jwt.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findByLogin(String login);
}
