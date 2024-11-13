import java.util.Random;
import java.util.Arrays;

public class MatrizAleatoria {

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 9;
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        // Llenar la matriz con números aleatorios
        llenarMatriz(matriz, random);

        // Imprimir la matriz antes de ordenar
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Ordenar cada columna
        ordenarColumnas(matriz);

        // Imprimir la matriz después de ordenar
        System.out.println("\nMatriz después de ordenar por columnas:");
        imprimirMatriz(matriz);
    }

    // Función para llenar la matriz con números aleatorios
    private static void llenarMatriz(int[][] matriz, Random random) {
        for (int col = 0; col < matriz[0].length; col++) {
            int min = 10 + (col * 10); // valor mínimo para la columna actual
            int max = min + 9;         // valor máximo para la columna actual

            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    // Función para imprimir la matriz
    private static void imprimirMatriz(int[][] matriz) {
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col] + "\t");
            }
            System.out.println();
        }
    }

    // Función para ordenar cada columna de la matriz de menor a mayor
    private static void ordenarColumnas(int[][] matriz) {
        // Iteramos sobre las columnas
        for (int col = 0; col < matriz[0].length; col++) {
            // Creamos un array temporal para la columna actual
            int[] columna = new int[matriz.length];

            // Copiar los elementos de la columna a un array temporal
            for (int row = 0; row < matriz.length; row++) {
                columna[row] = matriz[row][col];
            }

            // Ordenamos el array temporal
            Arrays.sort(columna);

            // Volver a colocar los elementos ordenados en la columna de la matriz
            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = columna[row];
            }
        }
    }
}