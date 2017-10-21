package com.repdep.representados.administracion;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.repdep.representados.controladores.ControladorDeportista;
import com.repdep.representados.entidades.Deportista;
import com.repdep.representados.entidades.TipoDeportista;

public class AdministradorRepresentados {

	private static final int OPCION_SALIDA = 4;
	private static ArrayList<Deportista> listaDeportistas = new ArrayList<Deportista>();
	
	public static void main(String[] args) throws Exception {
		int opcion =0;
		do {
			mostrarMenu();
			opcion = leerOpcion();
			ejecutarAccion(opcion);
		} while (opcion != OPCION_SALIDA);

	}

	private static void ejecutarAccion(int opcion) {
		if (opcion > 4){
			System.out.println("Opción invalida");
		}else if(opcion == 3) {
			imprimirRepresentados();
		}else{
			listaDeportistas.add(ControladorDeportista.crearDeportista(TipoDeportista.values()[opcion-1]));
		}
	}

	private static void imprimirRepresentados() {
		for (Deportista deportista: listaDeportistas){
			System.out.println(deportista.toString());
		}
	}

	private static int leerOpcion() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());
	}

	private static void mostrarMenu() {
		System.out.println("Sistema de Administracion de Representados");
		System.out.println("1. Agregar futbolista");
		System.out.println("2. Agregar Basketbolista");
		System.out.println("3. Listar Representados");
		System.out.println("4. Salir");
	}

}
