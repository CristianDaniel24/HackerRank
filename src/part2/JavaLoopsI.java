package part2;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            //System.out.println(N + " x " + i + " = " + (N * i));
            System.out.printf("%d x %d = %d%n", N, i, (N * i));
        }
        scanner.close();
    }
}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
         for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        bufferedReader.close();
    }
}

 */

