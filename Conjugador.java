public class Conjugador {

    public static void main(String[] args) {
        // Conjugación para "saltar" en el tiempo "Pretérito Perfecto Simple"
        System.out.println("Conjugando el verbo: saltar en Pretérito Perfecto Simple (P)");
        conjugarPretérito("saltar");
        System.out.println();

        // Conjugación para "comer" en el tiempo "Presente"
        System.out.println("Conjugando el verbo: comer en Presente (A)");
        conjugarPresente("comer");
        System.out.println();

        // Conjugación para "vivir" en el tiempo "Futuro"
        System.out.println("Conjugando el verbo: vivir en Futuro (F)");
        conjugarFuturo("vivir");
    }

    // Método para conjugar en el pretérito perfecto simple
    public static void conjugarPretérito(String verbo) {
        // Encontrar la raíz del verbo (quitamos las dos últimas letras)
        String raiz = verbo.substring(0, verbo.length() - 2);

        // Imprimir las conjugaciones en pretérito perfecto simple
        System.out.println("yo " + raiz + "é");
        System.out.println("tu " + raiz + "aste");
        System.out.println("el " + raiz + "ó");
        System.out.println("nosotros " + raiz + "amos");
        System.out.println("vosotros " + raiz + "asteis");
        System.out.println("ellos " + raiz + "aron");
    }

    // Método para conjugar en el presente
    public static void conjugarPresente(String verbo) {
        // Encontrar la raíz del verbo (quitamos las dos últimas letras)
        String raiz = verbo.substring(0, verbo.length() - 2);

        // Imprimir las conjugaciones en presente
        System.out.println("yo " + raiz + "o");
        System.out.println("tu " + raiz + "es");
        System.out.println("el " + raiz + "e");
        System.out.println("nosotros " + raiz + "emos");
        System.out.println("vosotros " + raiz + "éis");
        System.out.println("ellos " + raiz + "en");
    }

    // Método para conjugar en el futuro
    public static void conjugarFuturo(String verbo) {
        // El verbo en futuro no cambia la raíz, se agregan las terminaciones
        String raiz = verbo;

        // Imprimir las conjugaciones en futuro
        System.out.println("yo " + raiz + "é");
        System.out.println("tu " + raiz + "ás");
        System.out.println("el " + raiz + "á");
        System.out.println("nosotros " + raiz + "emos");
        System.out.println("vosotros " + raiz + "éis");
        System.out.println("ellos " + raiz + "án");
    }
}