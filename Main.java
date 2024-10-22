import java.util.Random;

public class Main {
    int filas = 10;
    int columnas = 9;
    int[][] tablero = new int[filas][columnas];

    public static void llenarTablero(int[][] tablero) {
        Random random = new Random();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                int numAleatorio = 10 * (j + 1) + random.nextInt(10);
                tablero[i][j] = numAleatorio;
            }
        }
    }
    public static void ordenarColumnas(int[][] tablero) {
        int filas = tablero.length;
        int columnas = tablero[0].length;

        for (int columna = 0; columna < columnas; columna++) {
            for (int i = 0; i < filas - 1; i++) {
                for (int j = i + 1; j < filas; j++) {
                    if (tablero[i][columna] > tablero[j][columna]) {
                        // Intercambiar valores
                        int aux = tablero[i][columna];
                        tablero[i][columna] = tablero[j][columna];
                        tablero[j][columna] = aux;
                    }
                }
            }
        }
    }
    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 9;
        int[][] tablero = new int[filas][columnas];

        llenarTablero(tablero);
        ordenarColumnas(tablero);
        imprimirTablero(tablero);
    }

}