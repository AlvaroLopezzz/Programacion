import java.util.Scanner;

public class encriptacionMensajes {
    public static void main(String[] args) {
        System.out.println("Escribe aqui tu frase para contar las vocales no acentuadas");
        Scanner letras = new Scanner(System.in);

        String abecedario ="abcdefghijklmnopqrstuvwxyz";
        int posLetraP = abecedario.indexOf('p');

        while (letras.hasNextLine()) {
            String cadena = letras.nextLine().toLowerCase();
            int posEncriptada = abecedario.indexOf(cadena.charAt(0));
            int desplazamiento = posLetraP - posEncriptada; //-1
            StringBuilder encriptado = new StringBuilder();

            for(int i = 0; i < cadena.length(); i++){
                posEncriptada = abecedario.indexOf(cadena.charAt(i));
                if(posEncriptada+desplazamiento<0){
                    int resp = cadena.length() - desplazamiento; //25
                }else if(posEncriptada+desplazamiento>26) {
                    desplazamiento = desplazamiento - 26;
                    int resp = cadena.length() - desplazamiento; //25
                }else {
                    encriptado.append(abecedario.charAt((posEncriptada + desplazamiento) % 26)); //
                }
            }
            if (cadena.equals("qGJO")) {
                break;
            }
            int vowelCount = 0;
            String messageLowerCase = encriptado.reverse().toString();

            for (int i = 0; i < messageLowerCase.length(); i++) {
                char c = messageLowerCase.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            System.out.println("El numero de vocales no acentuadas es: " + vowelCount);
        }
    }
}
