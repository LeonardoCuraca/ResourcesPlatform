package com.ResourcePlatform.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue
	@Column(name = "proId")
	private int proId;
	
	@Column(name = "proNegocio")
	private String proNegocio;
	@Column(name = "proNombre")
	private String proNombre;
	@Column(name = "proStock")
	private int proStock;
	@Column(name = "proPrecio")
	private double proPrecio;
	@Column(name = "proCodigo")
	private String proCodigo;
	@Column(name = "proDetalles")
	private String proDetalles;
	
	
	public Producto(int proId, String proNegocio, String proNombre, int proStock, double proPrecio, String proCodigo,
			String proDetalles) {
		super();
		this.proId = proId;
		this.proNegocio = proNegocio;
		this.proNombre = proNombre;
		this.proStock = proStock;
		this.proPrecio = proPrecio;
		this.proCodigo = proCodigo;
		this.proDetalles = proDetalles;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProNegocio() {
		return proNegocio;
	}
	public void setProNegocio(String proNegocio) {
		this.proNegocio = proNegocio;
	}
	public String getProNombre() {
		return proNombre;
	}
	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}
	public int getProStock() {
		return proStock;
	}
	public void setProStock(int proStock) {
		this.proStock = proStock;
	}
	public double getProPrecio() {
		return proPrecio;
	}
	public void setProPrecio(double proPrecio) {
		this.proPrecio = proPrecio;
	}
	public String getProCodigo() {
		return proCodigo;
	}
	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}
	public String getProDetalles() {
		return proDetalles;
	}
	public void setProDetalles(String proDetalles) {
		this.proDetalles = proDetalles;
	}
	
}
