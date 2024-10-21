import java.util.Random;
import java.util.Scanner;

public class hola {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;

    private static char[][] tablero;
    private static int filaBart;
    private static int columnaBart;

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
    private static void asignarPersonajesACasillaLibres(char caracter, int numRepeticiones){
        Random aleatorio = new Random();
        int filaAleatorio = -1;
        int columnaAleatorio = -1;
        for (int i = 0; i<numRepeticiones; i++) {
            do {
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorio][columnaAleatorio] != 'L');
            tablero[filaAleatorio][columnaAleatorio] = caracter;
        }
        if(caracter=='B'){
            filaBart = filaAleatorio;
            columnaBart = columnaAleatorio;
        }
    }
    // private static void asignarCaracterACasillasLibres(char carácter){

    //  int filaAleatorioHomer;
    //   int columnaAleatorioHomer;

    //   for (int i = 0; i < 10; i++) {
    //      do {
    //         filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
    //          columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
    //       } while (tablero[filaAleatorioHomer][columnaAleatorioHomer] != 'L');


    //         tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'caracter';

    public static void main(String[] args) {

        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        asignarLibreACasillasLibres('L');
        imprimirTablero();


        asignarPersonajesACasillaLibres('B', 1) ;



        imprimirTablero();

        asignarPersonajesACasillaLibres('H', 10);

        imprimirTablero();
        asignarPersonajesACasillaLibres('M',10);
        imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
        /*Desplazamiento de Bart*/
        /*A--> Izquierda*/
        /*S--> Abajo*/
        /*D--> Derecha*/
        /*W--> Arriba*/
        Scanner lector = new Scanner(System.in);
        /******************************************************************/
        /*JUGAR*/
        /******************************************************************/
        int vidas = 10;
        do {
            System.out.println("Dime el desplazamiento que quieres realizar");
            System.out.println("WASD");
            String desplazamiento = lector.nextLine();
            System.out.println("Desplazamiento=" + desplazamiento);

            switch (desplazamiento) {
                case "A":// Izquierda
                    if ((columnaBart - 1) >= 0) {
                        columnaBart = columnaBart - 1; //Ya lo tenemos en la casilla 0, -1 se sale del array
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                System.out.println("Has perdido una vida."
                                        + "Te quedan=" + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                columnaBart = columnaBart + 1;
                                break;
                        }


                    }else {
                    }   System.out.println("Desplazamiento=" + desplazamiento);


                    break;
                case "S":
                    if ((columnaBart - 1) >= 0) {
                        columnaBart = columnaBart - 1; //Ya lo tenemos en la casilla 0, -1 se sale del array
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                System.out.println("Has perdido una vida."
                                        + "Te quedan=" + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                columnaBart = columnaBart + 1;
                                break;
                        }

                    }else {
                    }   System.out.println("Desplazamiento=" + desplazamiento);



                    break;

                case "D":
                    if ((columnaBart + 1) >= 0) {
                        columnaBart = columnaBart - 1; //Ya lo tenemos en la casilla 0, -1 se sale del array
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart - 1] = 'L';
                                System.out.println("Has perdido una vida."
                                        + "Te quedan=" + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart - 1] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                columnaBart = columnaBart + 1;
                                break;
                        }
                    }else {
                    }   System.out.println("Desplazamiento=" + desplazamiento);


                    break;
                case "W":
                    if ((columnaBart - 1) >= 0) {
                        columnaBart = columnaBart - 1; //Ya lo tenemos en la casilla 0, -1 se sale del array
                        switch (tablero[filaBart][columnaBart]) {
                            case 'H':
                                vidas = vidas - 1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                System.out.println("Has perdido una vida."
                                        + "Te quedan=" + vidas + " vidas.");
                                break;
                            case 'L':
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart + 1] = 'L';
                                break;
                            case 'M':
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                columnaBart = columnaBart + 1;
                                break;
                        }
                    }else {
                    }   System.out.println("Desplazamiento=" + desplazamiento);


                    break;
                default:
                    break;
            }

            imprimirTablero();
        }
        while (vidas > 0) ;

    }
}