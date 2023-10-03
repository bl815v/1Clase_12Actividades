package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double kilos, gramos, libras, toneladas;
		System.out.println("CONVERSOR DE PESO DE UNA PERSONA");
		
		System.out.print("Digite el peso (kg): ");
		kilos = leer.nextDouble();
		while(kilos < 0) {
			System.out.print("Error. Digite el peso (kg): ");
			kilos = leer.nextDouble();
		}
		
		gramos = kilos * 1000;
		libras = kilos * 2.2046;
		toneladas = kilos / 1000;
		
		System.out.println("En gramos: " + String.format("%.2f", gramos) + "g"); // Muestra dos decimales
		System.out.println("En libras: " + String.format("%.2f", libras) + "lb");
		System.out.println("En toneladas: " + String.format("%.2f", toneladas) + "t");
		
		
	}
}
