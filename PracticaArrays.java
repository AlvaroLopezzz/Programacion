import java.util.Arrays;

public class PracticaArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        // 1. Rellenar el array en orden ascendente (0, 1, 2, ..., 9)
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Array en orden ascendente: " + Arrays.toString(array));

        // 2. Mostrar el array en orden inverso
        System.out.print("Array en orden inverso: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 3. Rellenar el array con números pares (0, 2, 4, ..., 18)
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("Array con números pares: " + Arrays.toString(array));

        // 4. Mostrar elementos de dos en dos (primer y segundo, tercer y cuarto, etc.)
        System.out.print("Elementos de dos en dos: ");
        for (int i = 0; i < array.length; i += 2) {
            // Aseguramos que no se produzca un error de índice fuera de rango
            System.out.print("[" + array[i] + ", ");
            if (i + 1 < array.length) {
                System.out.print(array[i + 1] + "] ");
            } else {
                System.out.print("] ");
            }
        }
        System.out.println();

        // 5. Rellenar el array con números impares (1, 3, 5, ..., 19)
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        System.out.println("Array con números impares: " + Arrays.toString(array));

        // 6. Duplicar cada elemento del array
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println("Array con cada elemento duplicado: " + Arrays.toString(array));

        // 7. Calcular la suma de todos los elementos
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("Suma de todos los elementos: " + suma);

        // 8. Buscar el valor máximo y mínimo del array
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}