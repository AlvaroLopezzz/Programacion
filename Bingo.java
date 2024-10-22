import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int[][] cartón = new int[3][9]; // 3 filas, 9 columnas
        boolean[][] númerosCartón = new boolean[10][10]; // Para marcar los números del 10 al 99

        // Llenar el cartón
        llenarCartón(cartón, númerosCartón);

        // Imprimir el cartón
        imprimirCartón(cartón);

        // Iniciar juego de Bingo
        jugarBingo(númerosCartón);
    }

    public static void llenarCartón(int[][] cartón, boolean[][] númerosCartón) {
        Random random = new Random();

        for (int col = 0; col < 9; col++) {
            int[] númerosColumna = new int[10]; // Arreglo para números del 10 al 19, 20 al 29, etc.
            int inicio = col * 10 + 10;
            int fin = inicio + 9;

            // Rellenar el arreglo con números
            for (int num = inicio; num <= fin; num++) {
                númerosColumna[num - inicio] = num;
            }

            // Mezclar los números (algoritmo de Fisher-Yates)
            for (int i = númerosColumna.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                int temp = númerosColumna[i];
                númerosColumna[i] = númerosColumna[j];
                númerosColumna[j] = temp;
            }

            // Seleccionar 3 números por columna
            for (int row = 0; row < 3; row++) {
                cartón[row][col] = númerosColumna[row];
                númerosCartón[cartón[row][col] / 10][cartón[row][col] % 10] = true; // Marcar el número como presente
            }
        }

        // Ordenar los números en cada columna
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 2; row++) {
                for (int nextRow = row + 1; nextRow < 3; nextRow++) {
                    if (cartón[row][col] > cartón[nextRow][col]) {
                        int temp = cartón[row][col];
                        cartón[row][col] = cartón[nextRow][col];
                        cartón[nextRow][col] = temp;
                    }
                }
            }
        }
    }

    public static void imprimirCartón(int[][] cartón) {
        System.out.println("Cartón de Bingo:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                if (cartón[row][col] != 0) { // Imprimir solo números
                    System.out.printf("%2d ", cartón[row][col]);
                } else {
                    System.out.print("   "); // Espacio en blanco
                }
            }
            System.out.println();
        }
    }

    public static void jugarBingo(boolean[][] númerosCartón) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean[] númerosJugados = new boolean[100]; // Para marcar números del 10 al 99

        System.out.println("Presiona Enter para sacar un número de Bingo, o 'q' para salir.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            // Sacar un número aleatorio entre 10 y 99
            int número;
            do {
                número = random.nextInt(90) + 10; // Números entre 10 y 99
            } while (númerosJugados[número]); // Asegurarse de que no se repita

            númerosJugados[número] = true;
            System.out.println("Número sacado: " + número);

            // Verificar si se han ganado todos los números
            boolean ganador = true;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (númerosCartón[i][j] && !númerosJugados[i * 10 + j]) {
                        ganador = false;
                    }
                }
            }

            if (ganador) {
                System.out.println("¡Has ganado el bingo!");
                break;
            }
        }

    }
}



