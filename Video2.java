import java.util.Random;



 public class Main {

     static Random ale = new Random();
     int MAX_FILA_TABLERO = 10;
     int MAX_COLUMNA_TABLERO = 10;
     public static int generarAleatorio(int semilla) {
         int numAle = ale.nextInt(semilla);
         return numAle;
     }

     public static void main(String[] args) {
         int MAX_FILA_TABLERO = 10;
         int MAX_COLUMNA_TABLERO = 10;
         //SCOPE
         //Escritura de tipo CAMELLO
         //int Array[] = nnew int[10];
         int arrayNumAleat[] = new int[10];

         int filaAleatorio = 0;
         int columnaAleatorio = 0;
         for (int i = 0; 0 < MAX_FILA_TABLERO; i++) { //coge lo que mide el array
             for (int j = 0; 0 < MAX_COLUMNA_TABLERO; j++)
                 filaAleatorio = ale.nextInt(MAX_FILA_TABLERO);
             columnaAleatorio = ale.nextInt(MAX_COLUMNA_TABLERO);
         }
     }

     private static void imprimirTablero() {
         int Tablero;
         for (int i = 0; i < MAX_FILA_TABLERO; i++) {
             for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                 System.out.print(Tablero[i][j] + " ");
             }
             System.out.println();
         }
         System.out.println();


     }
 }



