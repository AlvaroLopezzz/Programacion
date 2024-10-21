package com.example.main;


import java.util.Random;

public class Main{
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;

    private static char[][] tablero;

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


    private static void asignarLibreACasillasLibres(char caracter){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {

                tablero[i][j] = caracter;
            }
        }
    }
    private static void asignarPersonajesACasillasLibre(char caracter, int numRepeticiones) {
        Random aleatorio = new Random();
        int filaAleatorio;
        int columnaAleatorio;
        for (int i = 0; i < numRepeticiones; i++) {
            do {
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorio][columnaAleatorio] != 'L');
            tablero[filaAleatorio][columnaAleatorio] = caracter;
        }
    }
    //  private static void asignarCaracterACasillasLibres ( char caracter) {
    //     Random aleatorio = new Random();
    //   int filaAleatorioHomer;
    // int columnaAleatorioHomer;

    //for (int i = 0; i < 10; i++) {
    //  do {
    //   filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
    //   columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
    //} while (tablero[filaAleatorioHomer][columnaAleatorioHomer] != 'L');


    // tablero[filaAleatorioHomer][columnaAleatorioHomer] = caracter;
    //}
//        }
    public static void main (String [] args){

        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        asignarLibreACasillasLibres('L');
        imprimirTablero();


        asignarPersonajesACasillasLibre('B', 1);


        imprimirTablero();

        asignarPersonajesACasillasLibre('H', 10);

        imprimirTablero();
        asignarPersonajesACasillasLibre('M', 10);
        imprimirTablero();
        tablero[MAX_FILA_TABLERO - 1][MAX_COLUMNA_TABLERO - 1] = 'F';
        imprimirTablero();
    }



}