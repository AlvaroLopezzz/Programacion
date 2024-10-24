import java.util.Scanner;

public class Piramide {

    // Función para calcular la suma de bloques hasta el nivel n
    public static long sumaBloques(int n) {
        return (long) n * (2 * n - 1) * (2 * n + 1) / 3;
    }

    // Función para encontrar la máxima altura posible
    public static int maxAltura(long bloques) {
        int k = 0;
        while (true) {
            if (sumaBloques(k + 1) <= bloques) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            long bloques = scanner.nextLong();
            if (bloques == 0) {
                break;
            }
            System.out.println(maxAltura(bloques));
        }
        scanner.close();
    }
}