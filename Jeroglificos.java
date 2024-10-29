import java.util.Scanner;
public class Jeroglificos {
    public static void main(String[] args) {
        char[] letrasjeroglificas = {'H', 'R', 'D', 'F', 'C', 'G', 'T',};
        while (true) {
            System.out.println("Escriba la cantidad de casos:");
            Scanner scan = new Scanner(System.in);
            String number = scan.next();
            for (int i = 0; i < number.length(); i++) {
                for (int j = 0; j < Character.getNumericValue(number.charAt(i)); j++) {
                    System.out.print(letrasjeroglificas[i + letrasjeroglificas.length - number.length()]);
                }
            }
            System.out.println("");
        }
    }
}