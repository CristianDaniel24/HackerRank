package part3;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        staircase(n);

    }

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i < n; i++) {
            System.out.printf("%" + n + "s%n", "#".repeat(i));
        }



        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }

         */
    }
}