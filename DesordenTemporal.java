import java.util.*;

public class DesordenTemporal {
    // Fenwick Tree o Binary Indexed Tree (BIT)
    static class FenwickTree {
        private int[] tree;
        private int size;

        public FenwickTree(int size) {
            this.size = size;
            tree = new int[size + 1];
        }

        // Sumar hasta el índice `i`
        public int sum(int i) {
            int result = 0;
            while (i > 0) {
                result += tree[i];
                i -= i & -i;
            }
            return result;
        }

        // Actualizar el índice `i` con el valor `delta`
        public void update(int i, int delta) {
            while (i <= size) {
                tree[i] += delta;
                i += i & -i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;  // Fin de los casos

            int[] ages = new int[n];
            for (int i = 0; i < n; i++) {
                ages[i] = sc.nextInt();
            }

            // Resolver el caso usando un Fenwick Tree
            int maxAge = Arrays.stream(ages).max().getAsInt(); // El valor máximo de edad real
            FenwickTree fenwickTree = new FenwickTree(maxAge);

            long totalDisorder = 0;
            for (int i = 0; i < n; i++) {
                int age = ages[i];
                // Contamos cuántos valores menores que `age` han sido procesados
                totalDisorder += fenwickTree.sum(age - 1);
                // Registramos la edad `age` en el Fenwick Tree
                fenwickTree.update(age, 1);
            }

            System.out.println(totalDisorder);
        }


    }
}