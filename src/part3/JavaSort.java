package part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            Student st2 = new Student(id, fname, cgpa);
            studentList.add(st);
            if ((st.getCgpa()) != st2.getCgpa()) {

            }
            testCases--;
        }
        // Ordenar la lista utilizando un Comparator con lambda
        studentList.sort((o1, o2) -> {
            if (o1.getCgpa() != o2.getCgpa()) {
                return Double.compare(o2.getCgpa(), o1.getCgpa());
            } else if (!o1.getFname().equals(o2.getFname())) {
                return o1.getFname().compareTo(o2.getFname());
            } else {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });

        // Imprimir los nombres en el orden especificado
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

    }
}
