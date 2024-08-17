package ruleta;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        String textoInvertido = new StringBuilder(texto).reverse().toString();

        if (textoInvertido.equals(texto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
