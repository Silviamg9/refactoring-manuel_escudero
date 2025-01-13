package refactoring;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double n1, n2, n3, n4, n5;

		System.out.println("Introduzca 5 números decimales: ");

		System.out.print("Número 1: ");
		n1 = s.nextDouble();
		System.out.print("Número 2: ");
		n2 = s.nextDouble();
		System.out.print("Número 3: ");
		n3 = s.nextDouble();
		System.out.print("Número 4: ");
		n4 = s.nextDouble();
		System.out.print("Número 5: ");
		n5 = s.nextDouble();

		double[] numeros = { n1, n2, n3, n4, n5 };

		System.out.println("Los números que ingresaste son: ");
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println(numeros[4]);

		s.close();
	}

}
