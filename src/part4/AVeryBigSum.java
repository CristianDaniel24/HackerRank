package part4;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        Long[] numbers = new Long[size];
        scanner.nextLine();
        String number = scanner.nextLine();
        String[] numberLong = number.split(" ");

        for (int i = 0; i < numberLong.length; i++) {
            numbers[i] = Long.parseLong(numberLong[i]);
        }

        long sum = 0;
        for (Long numberResult : numbers) {
            sum += numberResult;
        }
        System.out.println(sum);
    }
}
