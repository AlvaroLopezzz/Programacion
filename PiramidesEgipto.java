import java.util.Scanner;

public class PiramidesEgipto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numCasos = scanner.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            // Calcular distancias
            int distanciaA = Math.abs(A - B);
            int distanciaC = Math.abs(C - B);

            // Comparar distancias y decidir la salida
            if (distanciaA < distanciaC) {
                System.out.println(A);
            } else if (distanciaC < distanciaA) {
                System.out.println(C);
            } else {
                System.out.println("EMPATE");
            }
        }


    }
}