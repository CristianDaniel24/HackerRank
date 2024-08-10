package part1;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enteros = scanner.nextInt();
        double decimales = scanner.nextDouble();
        scanner.nextLine();
        String texto = scanner.nextLine();

        System.out.println("String: " + texto);
        System.out.println("Double: " + decimales);
        System.out.println("Int: " + enteros);
    }
}
