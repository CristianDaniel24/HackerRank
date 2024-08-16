package part3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudentSolution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);
        for (Integer resultado : result) {
            System.out.println(resultado);
        }

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> notaRedondeada = new ArrayList<>();

        for (int nota : grades) {
            if (nota >= 38) {
                int multiploDeCinco = ((nota / 5) + 1) * 5;
                if (multiploDeCinco - nota < 3) {
                    notaRedondeada.add(multiploDeCinco);
                } else {
                    notaRedondeada.add(nota);
                }
            } else {
                notaRedondeada.add(nota);
            }
        }

        return notaRedondeada;
    }
}
