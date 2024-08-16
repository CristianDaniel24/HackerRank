package part1;

import java.util.List;
import java.util.Scanner;

class Result1 {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int suma = 0;
        for (Integer result : ar) {
            suma += result;
        }
        return suma;
    }
}

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        Integer[] numbersArray = new Integer[size];

        int resultado = simpleArraySum(numbersArray, size, scanner);
        System.out.println(resultado);
    }

    public static int simpleArraySum(Integer[] numbersArray, int size, Scanner scanner) {
        // Write your code here

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the numers:");
            numbersArray[i] = scanner.nextInt();
        }

        return Result1.simpleArraySum(List.of(numbersArray));
    }
}