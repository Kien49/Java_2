package Day2;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //Collection
        Collection<String> stringCollection = new ArrayList<>();
        //Them 1 string
        stringCollection.add("Hello");
        stringCollection.add("Hi");
        //In ra colllection
        System.out.println(stringCollection);
        //Thay doi gtri 1 phan tu theo index


        //Xoa 1 phan tu
        stringCollection.remove("Hello");
        System.out.println(stringCollection);
        // Lay ra kich thuoc
        System.out.println(stringCollection.size());
    }
}
