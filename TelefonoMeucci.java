import java.util.Random;

public class TelefonoMeucci {

    // Método para contar los números de teléfono distintos representados por el número romano
    public static int ContadorNumerosRomanosTelefono(String romano) {
        // Mapa de dígitos romanos válidos
        String[] romanoDigitos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        // Usamos un array para representar el número de formas de interpretar los primeros i caracteres
        int n = roman.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;  // Una forma de interpretar la cadena vacía

        // Recorremos la cadena
        for (int i = 1; i <= n; i++) {
            // Intentamos ver qué partes finales de la cadena son números romanos válidos
            for (int length = 1; length <= 3; length++) {  // Longitudes posibles de números romanos (1 a 3 caracteres)
                if (i - length >= 0) {
                    String substring = roman.substring(i - length, i);
                    // Si el substring es un número romano válido, actualizamos dp[i]
                    if (esRomanoValido(substring, romanDigits)) {
                        dp[i] += dp[i - length];
                    }
                }
            }
        }

        return dp[n];
    }

    // Método que verifica si una cadena dada es un dígito romano válido
    public static boolean esRomanoValido(String roman, String[] romanoDigitos) {
        for (String validoRomano : romanoDigitos) {
            if (roman.equals(validoRomano)) {
                return true;
            }
        }
        return false;
    }

    // Método para generar un número romano aleatorio entre 5 y 15 caracteres
    public static String GenerarNumeroRomanoRandom(int minLength, int maxLength) {
        Random rand = new Random();
        StringBuilder NumeroRomano = new StringBuilder();
        // Elegir una longitud aleatoria entre minLength y maxLength
        int length = rand.nextInt(maxLength - minLength + 1) + minLength;

        // Lista de símbolos romanos válidos
        String[] romanoSimbolos = {"I", "V", "X"};

        // Generamos un número romano aleatorio de la longitud deseada
        for (int i = 0; i < length; i++) {
            romanNumber.append(romanoSimbolos[rand.nextInt(3)]); // Selecciona aleatoriamente entre I, V, X
        }

        return NumeroRomano.toString();
    }

    public static void main(String[] args) {
        // Generamos ejemplos aleatorios entre 5 y 15 caracteres
        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {  // Generamos 5 ejemplos aleatorios
            String randomRoman = GenerarNumeroRomanoRandom(5, 15);
            System.out.println("Ejemplo " + i + " - Número romano: " + randomRoman);
            System.out.println("Posibles números de teléfono: " +  ContadorNumerosRomanosTelefono(randomRomano));
            System.out.println();
        }
    }
}
