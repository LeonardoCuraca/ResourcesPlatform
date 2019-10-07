package com.ResourcePlatform.demo.model;

public class Negocio {
	private int negId;
	private String negUsuario;
	private String negNombre;
	private String negDireccion;
	private String negCodigoPostal;
	private int negTelefono;
	private String negPassword;
	private String negEmail;
	private String negDetalles;
	public Negocio(int negId, String negUsuario, String negNombre, String negDireccion, String negCodigoPostal,
			int negTelefono, String negPassword, String negEmail, String negDetalles) {
		super();
		this.negId = negId;
		this.negUsuario = negUsuario;
		this.negNombre = negNombre;
		this.negDireccion = negDireccion;
		this.negCodigoPostal = negCodigoPostal;
		this.negTelefono = negTelefono;
		this.negPassword = negPassword;
		this.negEmail = negEmail;
		this.negDetalles = negDetalles;
	}
	public int getNegId() {
		return negId;
	}
	public void setNegId(int negId) {
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
	public int getNegTelefono() {
		return negTelefono;
	}
	public void setNegTelefono(int negTelefono) {
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
