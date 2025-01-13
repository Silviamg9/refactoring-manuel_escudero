package refactoring;

public class Ejercicio2 {

	public static void main(String[] args) {

		char v1 = 'a', v2 = 'e', v3 = 'i', v4 = 'o', v5 = 'u';
		char[] vocales = { v1, v2, v3, v4, v5 };

		char[] tabla = new char[20];

		int[] f = new int[5];

		for (int x = 0; x < 20; x++) {
			int r = (int) (Math.random() * 5);
			tabla[x] = vocales[r];
		}

		for (int x = 0; x < 20; x++) {
			if (tabla[x] == 'a') {
				f[0] = f[0] + 1;
			} else if (tabla[x] == 'e') {
				f[1] = f[1] + 1;
			} else if (tabla[x] == 'i') {
				f[2] = f[2] + 1;
			} else if (tabla[x] == 'o') {
				f[3] = f[3] + 1;
			} else if (tabla[x] == 'u') {
				f[4] = f[4] + 1;
			}
		}

		System.out.println("Tabla de vocales aleatorias:");
		for (int x = 0; x < 20; x++) {
			System.out.print(tabla[x] + " ");
		}

		System.out.println("\n\nFrecuencia de cada vocal:");
		System.out.println("Vocal '" + v1 + "': " + f[0]);
		System.out.println("Vocal '" + v2 + "': " + f[1]);
		System.out.println("Vocal '" + v3 + "': " + f[2]);
		System.out.println("Vocal '" + v4 + "': " + f[3]);
		System.out.println("Vocal '" + v5 + "': " + f[4]);
	}

}
