package refactoring;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Longitud de la combinación: ");
		int l = scanner.nextInt();

		int[] cS = new int[l];
		for (int i = 0; i < l; i++) {
			cS[i] = r.nextInt(5) + 1;
		}

		boolean correcto = false;
		while (!correcto) {
			System.out.println("Introduce tu intento: ");
			int[] iT = new int[l];
			for (int i = 0; i < l; i++) {
				iT[i] = scanner.nextInt();
			}

			correcto = true;
			for (int i = 0; i < l; i++) {
				if (iT[i] != cS[i]) {
					correcto = false;
					if (iT[i] < cS[i]) {
						System.out.println("Posición " + (i + 1) + ": Mayor");
					} else {
						System.out.println("Posición " + (i + 1) + ": Menor");
					}
				}
			}

			if (correcto) {
				System.out.println("¡Combinación correcta!");
			}
		}

	}

}
