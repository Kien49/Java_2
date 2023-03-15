package Day3.BChieu.BT2;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Faker faker = new Faker(new Locale("vi"));

        for (int i = 0; i < 1000 ; i++) {
            // Fake thong tin
            Human human = new Human();
            human.setId(i);

            human.setFirstName(faker.name().lastName());
            human.setLastName(faker.name().firstName());
            human.setCity(faker.address().cityName());
            human.setGender(faker.number().numberBetween(0, 2));
            human.setAge(faker.number().numberBetween(10,51));
            human.setSalary(faker.number().numberBetween(10,3001));
            // Them vao humanList
            humanList.add(human);
        }

        //humanList.stream().forEach(p-> System.out.println(p));

        long number1 = humanList.stream().filter(human -> human.getAge()>18 && human.getGender()==1)
                .count();
        System.out.println("Nam tren 18 tuoi: " + number1);

        long number2 = humanList.stream().filter(human -> human.getFullLastName().contains("thị") && human.getGender()==0)
                .count();
        System.out.println("Nu ten dem la thi: " + number2);

        //loc ra nhung nguoi ho nguyen va sap xep theo chu cai
        humanList.stream().filter(h-> h.getLastName().equalsIgnoreCase("Nguyễn"))
                .sorted()
                .forEach(System.out::println);

        humanList.stream().filter(h-> h.getAge()<=30 && h.getAge() >=20)
                .forEach(h-> System.out.println(h));

        //dem so luong thanh pho
        long number3 = humanList.stream().map(human -> human.getCity())
                .distinct()//k trung nhau
                .count();
        System.out.println("Co tat ca thanh pho la: " + number3);

        //lay ra 10 ng dau tien trong danh sach
        humanList.stream().limit(10)
                .forEach(h-> System.out.println(h));

    }
}