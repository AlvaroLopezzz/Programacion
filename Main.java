import java.util.Random;

public class Main {

    static Random ale = new Random();

    public static int generarAleatorio(int semilla) {
        int numAle = ale.nextInt(semilla);
        return numAle;
    }


    public static void main(String[] args) {
        //SCOPE
        //Escritura de tipo CAMELLO
        //int Array[] = nnew int[10];
        int arrayNumAleat[] = new int[10];


        for (int i = 0; 0 < arrayNumAleat.length; i++) { //coge lo que mide el array
            arrayNumAleat[i] = generarAleatorio(100); //numero aleatorio para la i
        }
    }
}
