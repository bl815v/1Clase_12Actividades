package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double presupuesto, urgencias, pediatria, traumatologia, urgenciasTotal, pediatriaTotal, traumatologiaTotal;
		System.out.println("PRESUPUESTO ANUAL DEL HOSPITAL");
		
		urgencias = 0.37;
		pediatria = 0.42;
		traumatologia = 0.21;
		System.out.print("Digite el monto presupuestal: $");
		presupuesto = leer.nextDouble();
		while(presupuesto < 0) {
			System.out.print("Error. Digite el monto presupuestal: $");
			presupuesto = leer.nextDouble();
		}
		
		urgenciasTotal = presupuesto * urgencias;
		pediatriaTotal = presupuesto * pediatria;
		traumatologiaTotal = presupuesto * traumatologia;
		System.out.println("El presupuesto anual se divide asi: ");
		System.out.println("Urgencias: $" + String.format("%.2f", urgenciasTotal)); // Muestra dos decimales
		System.out.println("Pediatria: $" + String.format("%.2f", pediatriaTotal));
		System.out.println("Traumatologia: $" + String.format("%.2f", traumatologiaTotal));
		
		
	}
}
