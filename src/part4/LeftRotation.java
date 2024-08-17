package part4;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        int[] rotation = new int[n];
        for (int i = 0; i < n; i++) {
            rotation[i] = number[(i + d) % n];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(rotation[i] + " ");
        }

    }
}
