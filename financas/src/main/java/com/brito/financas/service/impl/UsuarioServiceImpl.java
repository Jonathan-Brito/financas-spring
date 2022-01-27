package com.brito.financas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brito.financas.exception.RegraNegocioException;
import com.brito.financas.model.entity.Usuario;
import com.brito.financas.model.repository.UsuarioRepository;
import com.brito.financas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {

		boolean existe = usuarioRepository.existsByEmail(email);
		
		if (existe) {
			throw new RegraNegocioException("Já existe um usuário com este email cadastrado");
		}

	}

}
