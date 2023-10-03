package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		byte a, b, c;
		int x;
		System.out.println("DIGITOS EN UNA VARIABLE");
		
		System.out.print("Digite el numero de A: ");
		a = leer.nextByte();
		while(a < 0 || a > 9) {
			System.out.print("Error. Digite el numero de A: ");
			a = leer.nextByte();
		}
		
		System.out.print("Digite el numero de B: ");
		b = leer.nextByte();
		while(b < 0 || b > 9) {
			System.out.print("Error. Digite el numero de B: ");
			b = leer.nextByte();
		}
		
		System.out.print("Digite el numero de C: ");
		c = leer.nextByte();
		while(c < 0 || c > 9) {
			System.out.print("Error. Digite el numero de C: ");
			c = leer.nextByte();
		}
		
		String aux = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
		x = Integer.parseInt(aux);
		
		System.out.print("x: " + x); 
		
		
	}
}
