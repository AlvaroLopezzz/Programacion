import java.util.Scanner;

public class piramideAltura {
    public static void main (String[] args) {

        Scanner leer = new Scanner(System.in);

        while(true) {
            System.out.println("Indica la cantidad de bloques que quieres introducir");
            int cant_bloques = leer.nextInt();
            int niveles = 0;
            int suma = 0;
            int bloques = 1;
            if (cant_bloques == 0) {
                break;
            }
            do {
                suma = (bloques * bloques) + suma;
                bloques += 2;
                niveles ++;

            } while (suma < cant_bloques);
            System.out.println("Los niveles mínimos que se pueden construir son: " + niveles);
        }
    }
}

