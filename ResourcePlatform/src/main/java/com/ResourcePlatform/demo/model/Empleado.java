package com.ResourcePlatform.demo.model;

public class Empleado {
	private int empId;
	private String empNegocio;
	private String empNombres;
	private String empApellidos;
	private int empTelefono;
	private String empEmail;
	private String empDomicilio;
	private int empDni;
	private String empDetalles;

	public Empleado(int empId, String empNegocio, String empNombres, String empApellidos, int empTelefono,
			String empEmail, String empDomicilio, int empDni, String empDetalles) {
		super();
		this.empId = empId;
		this.empNegocio = empNegocio;
		this.empNombres = empNombres;
		this.empApellidos = empApellidos;
		this.empTelefono = empTelefono;
		this.empEmail = empEmail;
		this.empDomicilio = empDomicilio;
		this.empDni = empDni;
		this.empDetalles = empDetalles;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpNegocio() {
		return empNegocio;
	}

	public void setEmpNegocio(String empNegocio) {
		this.empNegocio = empNegocio;
	}

	public String getEmpNombres() {
		return empNombres;
	}

	public void setEmpNombres(String empNombres) {
		this.empNombres = empNombres;
	}

	public String getEmpApellidos() {
		return empApellidos;
	}

	public void setEmpApellidos(String empApellidos) {
		this.empApellidos = empApellidos;
	}

	public int getEmpTelefono() {
		return empTelefono;
	}

	public void setEmpTelefono(int empTelefono) {
		this.empTelefono = empTelefono;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDomicilio() {
		return empDomicilio;
	}

	public void setEmpDomicilio(String empDomicilio) {
		this.empDomicilio = empDomicilio;
	}

	public int getEmpDni() {
		return empDni;
	}

	public void setEmpDni(int empDni) {
		this.empDni = empDni;
	}

	public String getEmpDetalles() {
		return empDetalles;
	}

	public void setEmpDetalles(String empDetalles) {
		this.empDetalles = empDetalles;
	}

}
