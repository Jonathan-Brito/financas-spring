package com.brito.financas.service;

import com.brito.financas.model.entity.Usuario;

public interface UsuarioService {
	
	public Usuario autenticar(String email, String senha);
	
	public Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);

}
