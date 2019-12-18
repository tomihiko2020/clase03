package com.senati.clase03solucion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int pos = 0, neg = 0, cero = 0; //contadores
	        int i;
	        int tp=0,ti=0;
	        int maximo = numeros[0]; // Declaramos e inicializamos el máximo.
			int minimo = numeros[0]; // Declaramos e inicializamos el máximo.

	         
	        //Leemos los valores por teclado y los guardamos en el array
	        System.out.println("Lectura de los elementos del array: ");
	        for (i = 0; i < numeros.length; i++) {
	            System.out.print("numeros[" + i + "]= ");
	            numeros[i] = sc.nextInt();
	        }
	        //se recorre el array para contar positivos, negativos y ceros
	        for (i = 0; i < numeros.length; i++) {
	            if (numeros[i] > 0) {
	                pos++;
	            } else if (numeros[i] < 0) {
	                neg++;
	            } else {
	                cero++;
	            }
	         // total de pares e impares tp y ti
		        
		        if(numeros[i] % 2 == 0) {
		        	tp++;
		        }
		        else { ti++;
		        }
	         // valores maximos y minimos
		        if (maximo < numeros[i])
					maximo = numeros[i];
				if (minimo > numeros[i])
					minimo = numeros[i];
		        
	        }
	        
	        
	        
	        //mostrar resultados
	        System.out.println("Positivos: " + pos);
	        System.out.println("Negativos: " + neg);
	        System.out.println("La máximo de la lista es " + maximo);
			System.out.println("La mínimo de la lista es " + minimo);
	        System.out.println("Ceros: " + cero);
	        System.out.println("Pares: " + tp);
	        System.out.println("Impares: " + ti);
	       
	    }
}
