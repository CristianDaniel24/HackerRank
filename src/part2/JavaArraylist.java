package part2;

import java.util.HashMap;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear un HashMap para almacenar los valores
        HashMap<Integer, String> numbersMap = new HashMap<>();

        int size = scanner.nextInt();
        String[] number = new String[size];

        for (int i = 0; i < size; i++) {
            scanner.nextLine();
            String numbers = scanner.nextLine();
            number = numbers.split(" ");
        }

        for (String name : number) {
            System.out.println(name);
        }

        for (int i = 0; i < number.length; i++) {
            int numbers = Integer.parseInt(number[i]);
            numbersMap.put(i, number[i]);
        }

        scanner.nextLine();
        int size2 = scanner.nextInt();

        for (int i = 0; i < size2; i++) {
            scanner.nextLine();
            int line = scanner.nextInt();
            int position = scanner.nextInt();

            if (numbersMap.containsKey(position) && numbersMap.containsValue(line)) {
                System.out.println(numbersMap.get(position));
            } else
                System.out.println("ERROR!");
        }
    }
}
