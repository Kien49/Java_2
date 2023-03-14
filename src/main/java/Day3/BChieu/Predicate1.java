package Day3.BChieu;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        //1 list String
        //Loc ra nhung chuoi co so tu lon hon 2 tu va co tu a
        List<String> stringList = Arrays.asList("Hello", "Hello world",
                "hi", "how are you", "a a aa");

        Function<String, Integer> countTuNumber = s -> {
            int count =0;
            if(s.charAt(0) != ' '){
                count ++;
            }
            for(int i=1; i< s.length()-1; i++){
                if(s.charAt(i)==' ' && s.charAt(i+1)!= ' '){
                    count++;
                }
            }

            return count;
        };

        Predicate<String> soTuLonHon2 = s -> (countTuNumber.apply(s)>2);

        Predicate<String> ktraCoChuA = s-> (s.contains("a"));

        for (String s:stringList) {
            if(soTuLonHon2.test(s) && ktraCoChuA.test(s)){
                System.out.println(s);
            }
        }
    }
}
