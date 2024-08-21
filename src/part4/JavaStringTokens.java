package part4;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stack = scanner.nextLine().trim();

        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] stackSplit = stack.split("[^A-Za-z]+");

        System.out.println(stackSplit.length);

        for (String tokens : stackSplit) {
            System.out.println(tokens);
        }
    }
}
