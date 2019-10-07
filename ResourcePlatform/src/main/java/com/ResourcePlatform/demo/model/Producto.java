package com.ResourcePlatform.demo.model;

public class Producto {
	private int proId;
	private String proNegocio;
	private String proNombre;
	private int proStock;
	private double proPrecio;
	private String proCodigo;
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
