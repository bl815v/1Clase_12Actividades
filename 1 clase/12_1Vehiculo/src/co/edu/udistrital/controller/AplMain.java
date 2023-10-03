package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double wAceleracion, tSegundos, distancia;
		System.out.println("DISTANCIA RECORRIDA - ACELERACION CONSTANTE");
		
		System.out.print("Digite la aceleracion (m/s^2): ");
		wAceleracion = leer.nextDouble();
		
		System.out.print("Digite el tiempo (segundos): ");
		tSegundos = leer.nextDouble();
		while(tSegundos <= 0) {
			System.out.print("Digite el tiempo (segundos): ");
			tSegundos = leer.nextDouble();
		}
		
		distancia = 0.5 * wAceleracion * tSegundos * tSegundos;
		System.out.print("La distancia recorrida es: " + String.format("%.2f", distancia) + " metros"); // Muestra dos decimales
		
		
	}
}
