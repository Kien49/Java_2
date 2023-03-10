package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //Tao 1 array list luu tru thong tin cua cac ban sinh vien
        List<Student> arrayList = new ArrayList<>();

        //them 1 ban sinh vien vao student
        Student s1 = new Student(1, "Student 1");
        arrayList.add(s1);

        Student s2 = new Student(2, "Student 2");
        arrayList.add(s2);

        //in ra danh sach sinh vien
        System.out.printf("Co %d sinh vien trong danh sach\n", arrayList.size());
        System.out.println(arrayList);

        //Thay doi ten cua Student 2
        Student s = arrayList.get(1);
        s.setName("Sinh vien");
        System.out.println(arrayList);

        //Thay the phan tu tai vi tri index = 1;
        Student s3 = new Student(3, "Std3");
        arrayList.set(1,s3);
        System.out.println(arrayList);

/*        //Xoa cac phan tu trong array
        arrayList.remove(0);
        System.out.println(arrayList);

        // Xoa phan tu theo Object
        arrayList.remove(s3);
        System.out.println(arrayList);*/

        //Sx cac phan tu
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}













