package part4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LeftRotationHackerRank {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        int n = arr.size();

        List<Integer> rotated = new ArrayList<>();

        for (int i = d; i < n; i++) {
            rotated.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            rotated.add(arr.get(i));
        }

        return rotated;
    }

    public static List<Integer> rotateLeftV2(int d, List<Integer> arr) {

        for (int i = 0; i < d; i++) {
            Integer deleted = arr.removeFirst();
            arr.addLast(deleted);
        }
        return arr;
    }

    public static List<Integer> rotateLeftV3(int d, List<Integer> arr) {

        Collections.rotate(arr, d * -1);

        return arr;
    }

}
