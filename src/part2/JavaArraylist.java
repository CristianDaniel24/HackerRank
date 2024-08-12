package part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<String[]> numbers = new ArrayList<>();

        //ArrayList<String[]> quiues = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            String number = scanner.nextLine();
            numbers.add(number.split(" "));
        }

        int size2 = scanner.nextInt();
        List<String> results = new ArrayList<>();

        for (int i = 0; i < size2; i++) {
            int x = scanner.nextInt();
            x -= 1;
            int y = scanner.nextInt();
            y -= 1;


            if (x < numbers.size() && y < numbers.get(x).length) {
                results.add(numbers.get(x)[y]);
            } else {
                results.add("ERROR!");
            }
        }
        for (String result : results) {
            System.out.println(result);
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