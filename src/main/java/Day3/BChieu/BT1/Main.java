package Day3.BChieu.BT1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student s1 = new Student(1,"S1", 10, "Nam", 10);
        Student s2 = new Student(2,"S2", 9, "Nam", 8);
        Student s3 = new Student(3,"S3", 11, "Nu", 5);
        Student s4 = new Student(4,"S4", 12, "Nu", 7);
        Student s5 = new Student(5,"S5", 12, "Nu", 7);

        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        listStudent.add(s5);

        //1
        Function<List<Student>, Double> ageTb = students -> {
            double ageTmp=0;
            for (int i = 0; i < students.size(); i++) {
                ageTmp += students.get(i).getAge();
            }
            return ageTmp/students.size();
        };
        System.out.println("Tuoi Tb: %.1f"+ ageTb.apply(listStudent));

        //2
        Function<List<Student>, Integer> markMax = students -> {
            int maxMark = students.get(0).getMark();
            for (int i = 0; i < students.size(); i++) {
                if(maxMark < students.get(i).getMark()){
                    maxMark = students.get(i).getMark();
                }
            }
            return maxMark;
        };
        System.out.println("Mark Max: %d"+ markMax.apply(listStudent));

        //3
        Function<List<Student>, Integer> markMin = students -> {
            int minMark = students.get(0).getMark();
            for (int i = 0; i < students.size(); i++) {
                if(minMark > students.get(i).getMark()){
                    minMark = students.get(i).getMark();
                }
            }
            return minMark;
        };
        System.out.println("Mark Min: %d"+ markMin.apply(listStudent));

        //4
        Function<List<Student>, Integer> markPb = students -> {
            int Mark = markMax.apply(listStudent);

            List<Integer> listTmp = new ArrayList<>();

            for (int i = 0; i < Mark; i++) {
                listTmp.add(i,0);
            }
            for (int i = 0; i < students.size(); i++) {
                //listTmp.set(i, )
            }
            return Mark;
        };
        System.out.println("Mark Pb: %d"+ markPb.apply(listStudent));
    }
}
