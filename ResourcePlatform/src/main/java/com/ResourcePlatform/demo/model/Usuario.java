package com.ResourcePlatform.demo.model;

public class Usuario {
	private int usuId;
	private String usuNegocio;
	private String usuNombres;
	private String usuApellidos;
	private String usuEmail;
	private String usuPassword;
	private String usuGenero;
	private String usuDetalles;
	
	public Usuario(int usuId, String usuNegocio, String usuNombres, String usuApellidos, String usuEmail,
			String usuPassword, String usuGenero, String usuDetalles) {
		super();
		this.usuId = usuId;
		this.usuNegocio = usuNegocio;
		this.usuNombres = usuNombres;
		this.usuApellidos = usuApellidos;
		this.usuEmail = usuEmail;
		this.usuPassword = usuPassword;
		this.usuGenero = usuGenero;
		this.usuDetalles = usuDetalles;
	}

	public int getUsuId() {
		return usuId;
	}

	public void setUsuId(int usuId) {
		this.usuId = usuId;
	}

	public String getUsuNegocio() {
		return usuNegocio;
	}

	public void setUsuNegocio(String usuNegocio) {
		this.usuNegocio = usuNegocio;
	}

	public String getUsuNombres() {
		return usuNombres;
	}

	public void setUsuNombres(String usuNombres) {
		this.usuNombres = usuNombres;
	}

	public String getUsuApellidos() {
		return usuApellidos;
	}

	public void setUsuApellidos(String usuApellidos) {
		this.usuApellidos = usuApellidos;
	}

	public String getUsuEmail() {
		return usuEmail;
	}

	public void setUsuEmail(String usuEmail) {
		this.usuEmail = usuEmail;
	}

	public String getUsuPassword() {
		return usuPassword;
	}

	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}

	public String getUsuGenero() {
		return usuGenero;
	}

	public void setUsuGenero(String usuGenero) {
		this.usuGenero = usuGenero;
	}

	public String getUsuDetalles() {
		return usuDetalles;
	}

	public void setUsuDetalles(String usuDetalles) {
		this.usuDetalles = usuDetalles;
	}

}
