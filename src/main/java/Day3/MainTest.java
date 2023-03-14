package Day3;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        //Tao 1 map rong
        Map<Person, List<Car>> listMap = new HashMap<>();
        // Tao 2 nguoi
        Person p1 = new Person(1, "User1", "nam");
        Person p2 = new Person(2, "User2", "nu");
        //Tao 3 xe
        Car c1 = new Car(1, "Red", "Honda");
        Car c2 = new Car(2, "White", "Volvo");
        Car c3 = new Car(3, "Black", "Kia");

        //p1 so huu xe 1
        listMap.put(p1, Arrays.asList(c1));
        //p2 so huu xe 2
        //listMap.put(p2, Arrays.asList(c2));

        //p1 mua them xe c3
        //Buoc 1 : Lay ra danh sach xe
        List<Car> p1List = new ArrayList<>(listMap.get(p1));
        p1List.add(c3);
        listMap.put(p1, p1List);
        System.out.println(listMap);


    }
}
