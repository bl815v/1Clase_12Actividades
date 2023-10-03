package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double x1, x2, y1, y2, distancia;
		System.out.println("DISTANCIA ENTRE DOS PUNTOS");
		
		System.out.println("PUNTO 1 (x,y)");
		System.out.print("Escriba el valor en el punto x: ");
		x1 = leer.nextDouble();
		System.out.print("Escriba el valor en el punto y: ");
		y1 = leer.nextDouble();
		
		System.out.println("PUNTO 2 (x,y)");
		System.out.print("Escriba el valor en el punto x: ");
		x2 = leer.nextDouble();
		System.out.print("Escriba el valor en el punto y: ");
		y2 = leer.nextDouble();
			
		distancia = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.print("la distancia entre el punto (" +x1 + ","+ y1 +") y (" + x2 + ","+ y2 +") es: "+ distancia); 
		
		
	}
}
