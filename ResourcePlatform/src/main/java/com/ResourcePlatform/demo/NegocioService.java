package com.ResourcePlatform.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourcePlatform.demo.model.Negocio;
import com.ResourcePlatform.demo.repository.NegocioRepository;

@Service
public class NegocioService {	
	@Autowired
	private NegocioRepository repo;
	
	public List<Negocio> listAll(){
		return repo.findAll();	
	}
	public void save(Negocio negocio) {
		repo.save(negocio);
	}
	public Negocio get(Long negId) {
		return repo.findById(negId).get();
	}
	
	public void delete(Long negId) {
		repo.deleteById(negId);
	}
	
}
