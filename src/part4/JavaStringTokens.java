package part4;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stack = scanner.nextLine();

        String[] stackSplit = stack.split("[ !,?._'@]+");

        System.out.println(stackSplit.length);

        for (String tokens : stackSplit) {
            System.out.println(tokens);
        }
    }
}
