package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int horas, minutos, segundos;
		double costoSeg, costo;
		System.out.println("COSTO DEL PROCESO POR TIEMPO");
		
		costoSeg = 3.25;
		
		System.out.println("Digite la cantidad de tiempo que tarda el proceso: ");
		
		System.out.print("Horas: ");
		horas = leer.nextInt();
		while(horas < 0) {
			System.out.print("Error. Horas: ");
			horas = leer.nextInt();
		}
		
		System.out.print("Minutos: ");
		minutos = leer.nextInt();
		while(minutos < 0) {
			System.out.print("Error. Minutos: ");
			minutos = leer.nextInt();
		}
		
		System.out.print("Segundos: ");
		segundos = leer.nextInt();
		while(segundos < 0) {
			System.out.print("Error. Segundos: ");
			segundos = leer.nextInt();
		}
		
		
		segundos = (horas * 3600) + (minutos * 60) + segundos;
		costo = segundos * costoSeg;
		System.out.print("El costo total del proceso es de: $" + String.format("%.2f", costo) + " COP"); // Muestra dos decimales
		
		
	}
}
