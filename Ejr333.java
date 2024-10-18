import java.util.Random;
public class RetroGrabacion {


    private static int MAX_FILA_TABLERO = 10;
    private static int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;


    public static void imprimirTablero() {

        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.println(tablero[i][j] + " ");
            }
            System.out.println("");


        }
        System.out.println("");

    }

    private static void asignarLibresACasillas(char caracter) {

        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = caracter;
            }
        }
    }

    private static void asignarBartaACasillas(char caracter) {
        Random aleatorio = new Random();
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        tablero[filaAleatorio][columnaAleatorio] = 'B';
    }

    private static void asignarCaracterCasillaLibre(char caracter, int numRepeticiones) {

        Random aleatorio = new Random();
        int filaAleatorio = -1;
        int columnaAleatorio = -1;
        for (int i = 0; i < numRepeticiones; i++) {
            do {

                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorio][columnaAleatorio] != 'L');
            tablero[filaAleatorio][columnaAleatorio] = caracter;
        }
    }




        public static void main (String[]args){
            tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

            asignarlibresACasillas('L');
            imprimirTablero();
            asignarBartACasillasLibre('B', 1);
            imprimirTablero();


            asignarPersonajeACasillaLibre('H', 10);
            imprimirTablero();

            asignarPersonajeACasillaLibre('M', 5);
            imprimirTablero();
            tablero[MAX_FILA_TABLERO - 1][MAX_COLUMNA_TABLERO - 1] = 'F';
            imprimirTablero();
            Scanner lector = new Scanner(System.in);

            System.out.prinln("Dime el desplazamiento que quieres realizar");
            System.out.prinln("WASD");
            String desplazamiento = lector.nextLine();
            System.out.prinln("Desplazamiento=" + desplazamiento);


        }


    }



//alvaro lopez




