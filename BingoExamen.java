import java.util.Random;
import java.util.Scanner;

public class BingoExamen {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;

    private static int[][] tableronumeros = new int[FILAS][COLUMNAS];
    private static String[][] tableromarcadores = new String[FILAS][COLUMNAS];
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        // Inicializar el tablero de números y marcadores
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tableronumeros[i][j] = aleatorio.nextInt(90) + 10; // Números entre 10 y 99
                tableromarcadores[i][j] = "XX"; // Marcadores vacíos
            }
        }

        Scanner scanner = new Scanner(System.in);
        int intentos = 10;

        System.out.println("Tablero de Marcadores (números ocultos):");
        mostrarTablero(tableromarcadores);

        while (intentos > 0) {
            System.out.print("Ingresa un número (10-99): ");
            int numeroUsuario = scanner.nextInt();

            boolean encontrado = false;
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    if (tableronumeros[i][j] == numeroUsuario) {
                        tableromarcadores[i][j] = "XX"; // Marcar el número encontrado
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("¡Número encontrado!");
            } else {
                System.out.println("Número no encontrado.");
            }

            intentos--;
            mostrarTablero(tableromarcadores);
        }

        System.out.println("Fin del juego.");
    }

    private static void mostrarTablero(String[][] marcadores) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(marcadores[i][j] + "\t");
            }
            System.out.println();
        }
    }
}