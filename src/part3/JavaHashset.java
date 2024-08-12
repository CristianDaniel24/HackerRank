package part3;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        //Se itera y se recibe los parametros de entrada en el Array de String
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        HashSet<String> pares = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String parStrings = pair_left[i] + " " + pair_right[i];
            pares.add(parStrings);
            System.out.println(pares.size());
        }
    }
}
