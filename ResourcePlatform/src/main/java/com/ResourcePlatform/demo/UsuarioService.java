package com.ResourcePlatform.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourcePlatform.demo.model.Usuario;
import com.ResourcePlatform.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listAll(){
		return repo.findAll();	
	}
	public void save(Usuario usuario) {
		repo.save(usuario);
	}
	public Usuario get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
