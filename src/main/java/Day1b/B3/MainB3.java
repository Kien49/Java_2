package Day1b.B3;

import java.util.Random;

public class MainB3 {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student(1,"S1", 7);
        student[1] = new Student(2,"S2", 5);
        student[2] = new Student(3,"S3", 8);

        //Mac dinh sx danh sach studen theo diem.
        SortArray sortArray = new SortArray();
        //In ra danh sasch trc khi sx
        sortArray.printArray(student);
        //In ra danh sach sau khi sx
        sortArray.sorted(student);
        sortArray.printArray(student);


        // Tao mang hinh tron
        HinhTron[] hinhTrons = new HinhTron[10];
        Random random = new Random();
        for (int i = 0; i < hinhTrons.length ; i++) {
            hinhTrons[i]= new HinhTron(random.nextInt(100)+1);
        }
        // In ra 10 hinh do
        sortArray.printArray(hinhTrons);
        // In ra 10 hinh sap xep
        sortArray.sorted(hinhTrons);
        sortArray.printArray(hinhTrons);

    }
}
