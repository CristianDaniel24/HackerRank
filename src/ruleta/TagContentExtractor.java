package ruleta;

import java.util.Scanner;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            String line = scanner.nextLine();
            line = line.replaceAll("<h1></h1><par></par><Amme></Amme><SA premium></SA premium>", "");
            System.out.println(line);
        }

    }
}
