package part2;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String palabraInvertida = new StringBuilder(A).reverse().toString();

        if (A.equals(palabraInvertida)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
