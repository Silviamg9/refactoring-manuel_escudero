package refactoring;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Tamaño de tabla 1: ");
		int a = sc.nextInt();
		int[] t1 = new int[a]; 
		System.out.println("Introduce tabla 1:");
		for (int i = 0; i < a; i++) {
			t1[i] = sc.nextInt(); 
		}

		System.out.print("Tamaño de tabla 2: ");
		int b = sc.nextInt(); 
		int[] t2 = new int[b];
		System.out.println("Introduce tabla 2:");
		for (int i = 0; i < b; i++) {
			t2[i] = sc.nextInt(); 
		}

		Arrays.sort(t1);
		Arrays.sort(t2);

		System.out.println("Tabla 1 ordenada: " + Arrays.toString(t1));
		System.out.println("Tabla 2 ordenada: " + Arrays.toString(t2));

		int[] f = new int[a + b]; 
		System.arraycopy(t1, 0, f, 0, a); 
		System.arraycopy(t2, 0, f, a, b); 

		Arrays.sort(f);
		System.out.println("Fusión ascendente: " + Arrays.toString(f));

		System.out.print("Fusión descendente: ");
		for (int i = f.length - 1; i >= 0; i--) {
			System.out.print(f[i] + " "); 
		}
	}

}
