package ruleta;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String[]> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String number = scanner.nextLine();
            String[] numberSplit = number.split(" ");
            numbers.add(numberSplit);
        }

        int size2 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size2; i++) {
            String queries = scanner.nextLine();
            String[] queriesSplit = queries.split(" ");
            int key = Integer.parseInt(queriesSplit[0]) - 1;
            int values = Integer.parseInt(queriesSplit[1]);

            if (key < numbers.size() && values < numbers.get(key).length) {
                System.out.println(numbers.get(key)[values]);
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
