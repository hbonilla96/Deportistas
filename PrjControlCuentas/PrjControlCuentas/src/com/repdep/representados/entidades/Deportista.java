package com.repdep.representados.entidades;

import java.math.BigDecimal;

public class Deportista {
	private String nombre; 
	private String apellido;  
	private BigDecimal estatura;
	private BigDecimal peso;  
	private String posicion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public BigDecimal getEstatura() {
		return estatura;
	}
	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura + ", peso=" + peso
				+ ", posicion=" + posicion + "]";
	}
	
}
