import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // PRIMITIVA
        Random alea = new Random();
        Scanner leer = new Scanner(System.in);
            String arrayPrimitiva[] = new String[6];
            for (int i = 0; i < arrayPrimitiva.length; i++){
                int numAle = alea.nextInt(100);
                //como puedo convertir un entero a cadena
                //CONVERSOR DE TIPOS DE DATOS
                // de int a String
                arrayPrimitiva[i] = String.valueOf(numAle) ;
        }


        for (int i = 0; i < arrayPrimitiva.length; i++){
            System.out.println(arrayPrimitiva[i]);
        }
        System.out.println("Dame un num");
        String cadUsuario1 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++){
            if(cadUsuario1.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame un num");
        String cadUsuario2 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++){
            if(cadUsuario2.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame un num");
        String cadUsuario3 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++){
            if(cadUsuario3.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        for (int i = 0; i < arrayPrimitiva.length; i++){
            System.out.println(arrayPrimitiva[i]);
        }
        // FIN PRIMITIVA
    }
}