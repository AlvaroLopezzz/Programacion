public class Simpson {
    static char[][] tablero = new char[10][10];

    // Rellenar el tablero con un solo carácter
    public static void rellenarTablero(char pers) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = pers; // Usar el carácter proporcionado
            }
        }
    }

    // Método para imprimir el tablero
    public static void imprimirTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        char personaje = '#'; // Carácter para rellenar el tablero

        rellenarTablero(personaje); // Rellenar el tablero con '#'
        imprimirTablero(); // Imprimir el tablero
    }
}