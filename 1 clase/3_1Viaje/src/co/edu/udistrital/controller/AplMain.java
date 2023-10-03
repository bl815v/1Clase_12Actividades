package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double kmRecorrido, precioKm, precioTotal;
		System.out.println("PRECIO BOLETO DE VIAJE");
		
		precioKm = 120;
		System.out.print("Digite el total de kilometros que se van a recorrer: ");
		kmRecorrido = leer.nextDouble();
		while(kmRecorrido < 0) {
			System.out.print("Error. Digite el total de kilometros que se van a recorrer: ");
			kmRecorrido = leer.nextDouble();
		}
		
		precioTotal = precioKm * kmRecorrido;
		System.out.print("El precio del boleto de viaje es: $" + String.format("%.2f", precioTotal) + " COP"); // Muestra dos decimales
		
		
	}
}
