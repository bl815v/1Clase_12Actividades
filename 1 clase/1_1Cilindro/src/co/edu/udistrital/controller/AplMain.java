package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double radio, altura, volumen;
		System.out.println("VOLUMEN DE CILINDRO");
		
		System.out.print("Digite el radio de la base: ");
		radio = leer.nextDouble();
		while(radio <= 0) {
			System.out.print("Error. Digite el radio de la base: ");
			radio = leer.nextDouble();
		}
		
		System.out.print("Digite la altura: ");
		altura = leer.nextDouble();
		while(altura <= 0) {
			System.out.print("Error. Digite la altura: ");
			altura = leer.nextDouble();
		}
		
		volumen = Math.PI * radio * radio * altura;
		System.out.print("El volumen del cilindro es: " + String.format("%.2f", volumen)); // Muestra dos decimales
		
		
	}
}
