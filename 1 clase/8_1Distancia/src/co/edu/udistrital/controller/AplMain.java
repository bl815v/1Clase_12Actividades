package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double metros, pies, pulgadas;
		System.out.println("CONVERSOR DE METROS");
		
		System.out.print("Digite los metros (m): ");
		metros = leer.nextDouble();
		
		
		pies = metros * 3.2808;
		pulgadas = metros * 39.370;
		System.out.println("Pies: " + String.format("%.2f", pies) + "'"); // Muestra dos decimales
		System.out.println("Pulgadas: " + String.format("%.2f", pulgadas) + "''");
		
		
	}
}
