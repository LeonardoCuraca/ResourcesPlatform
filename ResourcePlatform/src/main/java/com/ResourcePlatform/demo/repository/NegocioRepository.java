package com.ResourcePlatform.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ResourcePlatform.demo.model.Negocio;

public interface NegocioRepository extends JpaRepository<Negocio, Long> {

}
