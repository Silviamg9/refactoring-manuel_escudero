package refactoring;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d, e;
		System.out.println("Ingresa 5 números:");
		System.out.print("Número 1: ");
		a = sc.nextInt();
		System.out.print("Número 2: ");
		b = sc.nextInt();
		System.out.print("Número 3: ");
		c = sc.nextInt();
		System.out.print("Número 4: ");
		d = sc.nextInt();
		System.out.print("Número 5: ");
		e = sc.nextInt();

		int f = a * 2, g = b * 2, h = c * 2, i = d * 2, j = e * 2;

		int temp;
		if (f > g) {
			temp = f;
			f = g;
			g = temp;
		}
		if (g > h) {
			temp = g;
			g = h;
			h = temp;
		}
		if (h > i) {
			temp = h;
			h = i;
			i = temp;
		}
		if (i > j) {
			temp = i;
			i = j;
			j = temp;
		}
		if (f > g) {
			temp = f;
			f = g;
			g = temp;
		}
		if (g > h) {
			temp = g;
			g = h;
			h = temp;
		}
		if (h > i) {
			temp = h;
			h = i;
			i = temp;
		}
		if (f > g) {
			temp = f;
			f = g;
			g = temp;
		}
		if (g > h) {
			temp = g;
			g = h;
			h = temp;
		}
		if (f > g) {
			temp = f;
			f = g;
			g = temp;
		}

		System.out.println("\nLos números multiplicados por 2 y ordenados son:");
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);

		sc.close();
	}

}
