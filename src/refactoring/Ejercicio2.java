package refactoring;

public class Ejercicio2 {

	 public static void main(String[] args) {
	        char[] tabla = new char[20];
	        int[] frecuencias = new int[5]; // Para las vocales: a, e, i, o, u
	        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
	        Random random = new Random();

	        // Generar tabla con vocales aleatorias
	        for (int i = 0; i < tabla.length; i++) {
	            tabla[i] = vocales[random.nextInt(vocales.length)];
	        }

	        // Contar frecuencias usando switch
	        for (char c : tabla) {
	            switch (c) {
	                case 'a' -> frecuencias[0]++;
	                case 'e' -> frecuencias[1]++;
	                case 'i' -> frecuencias[2]++;
	                case 'o' -> frecuencias[3]++;
	                case 'u' -> frecuencias[4]++;
	            }
	        }

	        // Imprimir tabla de vocales
	        System.out.println("Tabla de vocales aleatorias:");
	        for (char c : tabla) {
	            System.out.print(c + " ");
	        }

	        // Imprimir frecuencias
	        System.out.println("\n\nFrecuencia de cada vocal:");
	        for (int i = 0; i < vocales.length; i++) {
	            System.out.println("Vocal '" + vocales[i] + "': " + frecuencias[i]);
	        }
	    }

}
