package part4;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationHackerRank {

    public static List<Integer> rotateLeft(int d, List<Integer> arr,int n) {
        // Write your code here

        List<Integer> rotateArr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int position = (i + d) % n;
            rotateArr.add(arr.get(position));
        }

        return rotateArr;
    }
}
