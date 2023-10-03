package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double cop, dolar, euro, dolarConv, euroConv;
		System.out.println("CAMBIO DE MONEDAS");
		
		dolar = 2950;
		euro = 3450;
		System.out.print("Digite el dinero en pesos colombianos (COP): $");
		cop = leer.nextDouble();
		while(cop < 0) {
			System.out.print("Error. Digite el radio de la base: ");
			cop = leer.nextDouble();
		}
		

		dolarConv = cop / dolar;
		euroConv = cop / euro;
		System.out.print("En dolares: $" + String.format("%.2f", dolarConv) + " USD"); // Muestra dos decimales
		System.out.print("\nEn euros: €" + String.format("%.2f", euroConv) + " EUR");

		
	}
}
