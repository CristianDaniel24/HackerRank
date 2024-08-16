package part2;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
    
        ArrayList<String[]> numbers = new ArrayList<>();

        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            String number = scanner.nextLine();
            numbers.add(number.split(" "));
        }

        int size2 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < size2; i++) {
            String queries = scanner.nextLine();
            String[] index = queries.split(" ");
            int key = Integer.parseInt(index[0]) - 1;
            int values = Integer.parseInt(index[1]);

            if (key < numbers.size() && values < numbers.get(key).length) {
                System.out.println(numbers.get(key)[values]);
            } else {
                System.out.println("ERROR!");
            }
        }
/*
        scanner.nextLine();
        for (int i = 0; i < size2; i++) {
            String quierie = scanner.nextLine();
            quiues.add(quierie.split(" "));
        }
        for (String[] queris : quiues) {
            System.out.println(Arrays.toString(queris));
        }

        int key = Integer.parseInt(Arrays.toString(quiues.get(0)));
        int values = Integer.parseInt(Arrays.toString(quiues.get(1)));

        if (key > quiues.size()) {
            System.out.println("ERROR!");
        }

        List<String> numbersfinal = List.of((quiues.get(key - 1)));

        if (values <= numbersfinal.size()) {
            System.out.println(numbersfinal.get(values));
        } else {
            System.out.println("ERROR!");
        }

 */
    }
}