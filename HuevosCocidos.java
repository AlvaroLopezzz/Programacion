import java.util.Scanner;

public class HuevosCocidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // La capacidad de la olla es fija, siempre 5 huevos
        int capacidad = 5;

        System.out.println("Ingrese el número de huevos a cocer:");

        while (true) {
            System.out.print("Número de huevos (h): ");
            int h = scanner.nextInt();

            // Si el número de huevos es 0, terminamos el programa
            if (h == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Calcular el número de tandas necesarias
            int tandas = (h + capacidad - 1) / capacidad;  // Esto es equivalente a ceil(h / capacidad)

            // El tiempo total de cocción es el número de tandas por 10 minutos
            int tiempoTotal = tandas * 10;

            // Imprimir el resultado
            System.out.println("El tiempo total de cocción es: " + tiempoTotal + " minutos.");
        }


    }
}
