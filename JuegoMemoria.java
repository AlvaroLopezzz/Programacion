import java.util.Scanner;

public class JuegoMemoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = {"sol", "luna", "estrella", "cielo", "mar", "montaña", "río", "nube", "flor", "árbol"};

        jugar(scanner, palabras);

        scanner.close();
    }

    // Función principal que organiza el flujo del juego
    public static void jugar(Scanner scanner, String[] palabras) {
        String[] respuestas = new String[10];

        // Mostrar palabras y pedir al usuario que repita las anteriores en orden
        for (int i = 0; i < palabras.length; i++) {
            mostrarPalabra(palabras[i]);
            respuestas[i] = palabras[i];

            if (!verificarRespuesta(scanner, respuestas, i)) {
                System.out.println("¡Incorrecto! La secuencia era: " + obtenerSecuencia(respuestas, i));
                System.out.println("Intenta de nuevo desde el inicio.");
                i = -1; // Reiniciar el juego
            } else {
                System.out.println("¡Correcto! Sigue a la siguiente palabra.\n");
            }
        }

        System.out.println("¡Felicidades! Has memorizado todas las palabras correctamente.");
    }

    // Función que muestra la palabra y pide la respuesta del usuario
    public static void mostrarPalabra(String palabra) {
        System.out.println("Palabra a memorizar: " + palabra);
    }

    // Función que verifica si la respuesta del usuario es correcta
    public static boolean verificarRespuesta(Scanner scanner, String[] respuestas, int i) {
        System.out.print("Escribe todas las palabras memorizadas hasta ahora: ");
        String entrada = scanner.nextLine();

        // Verificar si la respuesta es correcta
        String secuenciaCorrecta = obtenerSecuencia(respuestas, i);
        return entrada.equals(secuenciaCorrecta);
    }

    // Función que construye la secuencia de palabras hasta el índice i utilizando StringBuilder
    public static String obtenerSecuencia(String[] respuestas, int i) {
        StringBuilder secuencia = new StringBuilder();
        for (int j = 0; j <= i; j++) {
            secuencia.append(respuestas[j]).append(" ");
        }
        return secuencia.toString().trim(); // Eliminar el último espacio
    }
}
