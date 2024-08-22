package part4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<String> allResults = new ArrayList<>();

        while (testCases > 0) {
            String line = in.nextLine();

            Pattern pattern = Pattern.compile("<(.+?)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            List<String> results = new ArrayList<>();

            while (matcher.find()) {
                results.add(matcher.group(2));
            }

            if (results.size() > 0) {
                allResults.addAll(results);
            } else {
                allResults.add("None");
            }

            testCases--;
        }
    
        for (String result : allResults) {
            System.out.println(result);
        }
    }
}