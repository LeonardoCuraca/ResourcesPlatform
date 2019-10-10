package com.ResourcePlatform.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Negocio {
	
	@Id
	@GeneratedValue
	@Column(name = "negId")
	private Long negId;
	
	@Column(name = "negUsuario")
	private String negUsuario;
	@Column(name = "negNombre")
	private String negNombre;
	@Column(name = "negDireccion")
	private String negDireccion;
	@Column(name = "negCodigoPostal")
	private String negCodigoPostal;
	@Column(name = "negTelefono")
	private String negTelefono;
	@Column(name = "negPassword")
	private String negPassword;
	@Column(name = "negEmail")
	private String negEmail;
	@Column(name = "negDetalles")
	private String negDetalles;
	
	public Negocio() {
		
	}
	public Long getNegId() {
		return negId;
	}
	public void setNegId(Long negId) {
		this.negId = negId;
	}
	public String getNegUsuario() {
		return negUsuario;
	}
	public void setNegUsuario(String negUsuario) {
		this.negUsuario = negUsuario;
	}
	public String getNegNombre() {
		return negNombre;
	}
	public void setNegNombre(String negNombre) {
		this.negNombre = negNombre;
	}
	public String getNegDireccion() {
		return negDireccion;
	}
	public void setNegDireccion(String negDireccion) {
		this.negDireccion = negDireccion;
	}
	public String getNegCodigoPostal() {
		return negCodigoPostal;
	}
	public void setNegCodigoPostal(String negCodigoPostal) {
		this.negCodigoPostal = negCodigoPostal;
	}
	public String getNegTelefono() {
		return negTelefono;
	}
	public void setNegTelefono(String negTelefono) {
		this.negTelefono = negTelefono;
	}
	public String getNegPassword() {
		return negPassword;
	}
	public void setNegPassword(String negPassword) {
		this.negPassword = negPassword;
	}
	public String getNegEmail() {
		return negEmail;
	}
	public void setNegEmail(String negEmail) {
		this.negEmail = negEmail;
	}
	public String getNegDetalles() {
		return negDetalles;
	}
	public void setNegDetalles(String negDetalles) {
		this.negDetalles = negDetalles;
	}
	
}
