package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int xAnimales, yPatas, xPollos, xVacas;
		System.out.println("ANIMALES EN LA FINCA");
		
		System.out.print("Digite la cantidad de animales: ");
		xAnimales = leer.nextInt();
		while(xAnimales <= 0) {
			System.out.print("Error. Digite la cantidad de animales: ");
			xAnimales = leer.nextInt();
		}

		System.out.print("Digite la cantidad de patas: ");
		yPatas = leer.nextInt();
		while(yPatas < 2) {
			System.out.print("Error. Digite la cantidad de patas: ");
			yPatas = leer.nextInt();
		}
		
		xPollos = (4 * xAnimales - yPatas) / 2;
		xVacas = xAnimales - xPollos;
		System.out.print("El campesino tenia " + xPollos + " pollos y "  + xVacas + " vacas.");
		
		
	}
}
