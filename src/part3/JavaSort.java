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

        //TODO: Estudiar sobre el comparator lambdo
        // Ordenar la lista utilizando un Comparator con lambda
        studentList.sort((student1, student2) -> {
            if (student1.getCgpa() != student2.getCgpa()) {
                return Double.compare(student2.getCgpa(), student1.getCgpa());
            } else if (!student1.getFname().equals(student2.getFname())) {
                return student1.getFname().compareTo(student2.getFname());
            } else {
                return Integer.compare(student1.getId(), student2.getId());
            }
        });

        // Imprimir los nombres en el orden especificado
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

    }
}
