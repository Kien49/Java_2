package Day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainTest_b1 {
    public static void main(String[] args) {
        //Tao tu dien anh viet
        Generics<String, String> myDictionary = new Generics<>();
        myDictionary.setK("Hello");
        myDictionary.setV("Xin chao");
        System.out.println(myDictionary);

        Generics<String, List<String>> myDictionary1 = new Generics<>();
        myDictionary1.setK("Hi");
        myDictionary1.setV(Arrays.asList("XinChao, Chao, LoiChao"));
        System.out.println(myDictionary1);
    }
}
