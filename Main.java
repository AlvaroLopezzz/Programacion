package SimpsonProgF;

import java.sql.SQLOutput;

public class SimpsonProgF {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;

    private static char[][] tablero;

    public static void main(String[] args) {

        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {

                tablero[i][j] = 'L';
            }
        }
        imprimirTablero();


        Random aleatorio = new Ramdom();
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);

        tablero[filaAleatorio][columnaAleatorio] = 'B';


        imprimirTablero();

        int filaAleatorioHomer;
        int columnaAleatorioHomer;

        for (int i = 0; i < 10; i++) {
            do {
                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorioHomer][columnaAleatorioHomer] != 'L');


            tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'H';
        }
        imprimirTablero();
        int filaAleatorioMuro;
        int columnaAleatorioMuro;

        for (int i = 0; i < 10; i++) {
            do {
                filaAleatorioMuro = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorioMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorioMuro][columnaAleatorioMuro] != 'L');


            tablero[filaAleatorioMuro][columnaAleatorioMuro] = 'M';
        }
        imprimirTablero();
    }
        private static void imprimirTablero() {
            for (int i = 0; i < MAX_FILA_TABLERO; i++) {
                for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {

                    System.out.println(tablero[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
}
