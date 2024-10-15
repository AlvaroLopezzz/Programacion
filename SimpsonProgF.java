package SimpsonProgF;

import java.util.Random;

public class SimpsonProgF {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;

    private static char[][] tablero;

    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void asignarCaracterACasillasLibres(char caracter) {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = 'caracter';
            }
        }
    }
    private static void asignarBartACasillaLibre(char caracter) {
        Random aleatorio = new Random();
        // Colocar 'B' en una posición aleatoria
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        tablero[filaAleatorio][columnaAleatorio] = 'caracter';
    }
    public static void main(String[] args) {
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        asignarCaracterACasillasLibres('L');
        // Inicializar el tablero con 'L'
      imprimirTablero();
      asignarBartACasillaLibre('B');
        Random aleatorio = new Random();
        // Colocar 'B' en una posición aleatoria
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        tablero[filaAleatorio][columnaAleatorio] = 'B';
        imprimirTablero();

        // Colocar 10 'H'
        colocarElementos('H', 10, aleatorio);
        imprimirTablero();

        // Colocar 10 'M'
        colocarElementos('M', 10, aleatorio);
        imprimirTablero();
    }

    private static void colocarElementos(char elemento, int cantidad, Random aleatorio) {
        for (int i = 0; i < cantidad; i++) {
            int filaAleatorio;
            int columnaAleatorio;
            do {
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorio][columnaAleatorio] != 'L');

            tablero[filaAleatorio][columnaAleatorio] = elemento;
        }
    }

    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}