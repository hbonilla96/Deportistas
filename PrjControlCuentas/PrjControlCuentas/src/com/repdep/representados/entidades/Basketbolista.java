package com.repdep.representados.entidades;

import java.math.BigDecimal;

public class Basketbolista extends Deportista{

	private BigDecimal puntosPorPartido;
	private BigDecimal rebotesPorPartido;
	
	public BigDecimal getPuntosPorPartido() {
		return puntosPorPartido;
	}
	public void setPuntosPorPartido(BigDecimal puntosPorPartido) {
		this.puntosPorPartido = puntosPorPartido;
	}
	public BigDecimal getRebotesPorPartido() {
		return rebotesPorPartido;
	}
	public void setRebotesPorPartido(BigDecimal rebotesPorPartido) {
		this.rebotesPorPartido = rebotesPorPartido;
	}
	
}
