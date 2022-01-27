package com.brito.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brito.financas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	boolean existsByEmail(String email);

}
