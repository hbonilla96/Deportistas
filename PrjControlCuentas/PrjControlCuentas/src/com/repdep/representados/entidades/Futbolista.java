package com.repdep.representados.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Futbolista extends Deportista{
	private int edad;
	private ArrayList<String> equipos;
	private BigDecimal ficha;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<String> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<String> equipos) {
		this.equipos = equipos;
	}

	public BigDecimal getFicha() {
		return ficha;
	}
	
}
