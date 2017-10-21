package com.repdep.representados.controladores;

import com.repdep.representados.entidades.Basketbolista;
import com.repdep.representados.entidades.Deportista;
import com.repdep.representados.entidades.Futbolista;
import com.repdep.representados.entidades.TipoDeportista;

public class ControladorDeportista {
	
	public static Deportista crearDeportista(TipoDeportista tipo){
	
		switch(tipo){
		case Futbolista:
			return new Futbolista();
		case Basketbolista:
			return new Basketbolista();
		}
		return null;
	}
}
