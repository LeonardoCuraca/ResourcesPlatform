package com.ResourcePlatform.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ResourcePlatform.demo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}