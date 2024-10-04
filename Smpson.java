// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Smpson {
    static char [][]tablero = new char[10][10]; //0 a n-1 casiillas van de 0 a 9 10-1
        //Software de gestión de venta ONLINE
    public static void rellenarTablero(char pers) {
        //char [][] tablero =new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = 'L';
            }

        }
    }//RellenarTablero ('L');
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
       // int contador = 0;
        char personaje = '#';
        rellenarTablero(personaje);
                                                      // contador = 10;
        //contador = 10;
        rellenarTablero(contador);
        }
    }
}