package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double xpesos, interesMensual, tasaAnual;
		System.out.println("PAGO DE INTERES MENSUAL");
		
		tasaAnual = 0.27;
		System.out.print("Digite la cantidad de dinero del prestamo: ");
		xpesos = leer.nextDouble();
		while(xpesos < 0) {
			System.out.print("Error. Digite la cantidad de dinero del prestamo: ");
			xpesos = leer.nextDouble();
		}
		
		interesMensual = (tasaAnual / 12) * xpesos;
		System.out.print("Valor del interes mensual: " + String.format("%.2f", interesMensual)); // Muestra dos decimales
	
		
	}
}
