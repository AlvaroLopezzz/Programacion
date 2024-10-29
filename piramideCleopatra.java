import java.util.Scanner;
public class piramideCleopatra {
    public static void main(String[] args) {

        System.out.println("Escriba la cantidad de casos:");
        Scanner numeros = new Scanner(System.in);
        int casos = numeros.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Escriba el año A:");
            int A = numeros.nextInt();

            System.out.println("Escriba el año B:");
            int B = numeros.nextInt();

            System.out.println("Escriba el año C:");
            int C = numeros.nextInt();

            int distanciaAB = Math.abs(B - A);
            int distanciaCB = Math.abs(B - (C - 1));

            // Comprobar cuál de los años (A o C) está más cerca de B
            if (distanciaAB < distanciaCB) {
                System.out.println("El año más cercano a B es: " + A);
            } else if (distanciaCB < distanciaAB) {
                System.out.println("El año más cercano a B es: " + C);
            } else {
                // Empate
                System.out.println("EMPATE");
            }
        }
    }
}
