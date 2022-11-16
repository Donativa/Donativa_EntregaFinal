package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Usuarios;
import com.cadastro.repositories.UsuarioRepository;
import com.cadastro.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuarios saveUsuarios(Usuarios usuarios) {
		return repository.save(usuarios);
	}
	
	@Override
	public List<Usuarios> getAllUsuarios() {
		return repository.findAll();
	}
	
	@Override
	public Usuarios getUsuariosById(long id_usuario) {
		return repository.findById(id_usuario).orElseThrow(()
			-> new ResourceNotFoundException("Usuario", "id", id_usuario));
	}
	
	@Override
	public Usuarios updateUsuarios(Usuarios usuario, long id_usuario) {
		
		Usuarios existe = repository.findById(id_usuario).orElseThrow(()
					-> new ResourceNotFoundException("Usuário", "id", id_usuario));
		
		existe.setNome_usuario(usuario.getNome_usuario());
		existe.setEmail(usuario.getEmail());
		existe.setSenha(usuario.getSenha());
		
		repository.save(existe);
		return existe;
	}
	
	@Override
	public void deleteUsuarios(long id_usuario) {
		repository.findById(id_usuario).orElseThrow(()
				-> new ResourceNotFoundException("Usuário", "id", id_usuario));
	}
}
