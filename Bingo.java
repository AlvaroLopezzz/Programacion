import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 9;
        List<Integer> numerosBingo = new ArrayList<>();

        // Rellenar la lista con números del 10 al 99
        for (int i = 10; i <= 99; i++) {
            numerosBingo.add(i);
        }

        // Mezclar los números
        Collections.shuffle(numerosBingo);

        // Imprimir la tabla de bingo
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int index = i * columnas + j;
                System.out.printf("%2d ", numerosBingo.get(index));
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (!numerosBingo.isEmpty()) {
            System.out.println("Presiona Enter para generar un número para jugar al bingo...");
            scanner.nextLine(); // Espera a que el usuario presione Enter

            // Generar un número aleatorio y eliminarlo de la lista
            int index = rand.nextInt(numerosBingo.size());
            int numeroAleatorio = numerosBingo.remove(index);

            System.out.println("Número para jugar al bingo: " + numeroAleatorio);
        }

        // Mensaje final cuando se acaban los números
        System.out.println("¡No quedan más números para jugar al bingo!");
        System.out.println("¡Has ganado el bingo!");
        scanner.close();
    }
}


