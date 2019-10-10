package com.ResourcePlatform.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "usuapellido")	
	private String usuapellido;
	@Column(name = "usunombre")
	private String usunombre;
	@Column(name = "usuemail")
	private String usuemail;
	@Column(name = "usupassword")
	private String usupassword;
	@Column(name = "usugenero")
	private String usugenero;
	@Column(name = "usudetalle")
	private String usudetalle;
		
	public Usuario() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuapellido() {
		return usuapellido;
	}
	public void setUsuapellido(String usuapellido) {
		this.usuapellido = usuapellido;
	}
	public String getUsunombre() {
		return usunombre;
	}
	public void setUsunombre(String usunombre) {
		this.usunombre = usunombre;
	}
	public String getUsuemail() {
		return usuemail;
	}
	public void setUsuemail(String usuemail) {
		this.usuemail = usuemail;
	}
	public String getUsupassword() {
		return usupassword;
	}
	public void setUsupassword(String usupassword) {
		this.usupassword = usupassword;
	}
	public String getUsugenero() {
		return usugenero;
	}
	public void setUsugenero(String usugenero) {
		this.usugenero = usugenero;
	}
	public String getUsudetalle() {
		return usudetalle;
	}
	public void setUsudetalle(String usudetalle) {
		this.usudetalle = usudetalle;
	}
	

}