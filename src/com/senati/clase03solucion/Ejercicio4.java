package com.senati.clase03solucion;

import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para crear una secuencia de 10 números aleatorios enteros comprendidos entre 0 y 9 ambos incluídos escribimos
		Random rnd = new Random();
    	int x;
    	for (int i = 0; i < 10; i++) {
        	x = (int)(rnd.nextDouble() * 10.0);
        	System.out.println(x);
    	}
	}

}
