package com.inforcap.codingdojo;

import java.util.ArrayList;

public class ListaExcepciones {

	public static void main(String[] args) {
		ArrayList<Object> lista = new ArrayList<Object>();		
		lista.add("13");
		lista.add("Hola Mundo");
		lista.add(48);
		lista.add("Adios Mundo");	
		
		for (int i = 0; i < lista.size(); i++) {
			try {
				//int valorInt = (int)lista.get(i);
				Integer numero = Integer.parseInt(lista.get(i).toString());
				System.out.println("Se hizo el cast de: "+numero);
			} catch (Exception e) {	
				System.out.println("No se pudo realizar el cast a: "+lista.get(i));						
			}
		}
		
	}

}
