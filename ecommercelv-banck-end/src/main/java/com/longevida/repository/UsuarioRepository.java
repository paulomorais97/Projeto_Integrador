package com.longevida.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.longevida.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	
	
}
