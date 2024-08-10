package part1;

import java.util.Scanner;

public class FuncionIfElseJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            //Par
            if (num >= 6 && num <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            //Impar
            System.out.println("Weird");
        }
    }
}
