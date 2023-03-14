package Day3.BChieu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        //Duyet list va in ra gia tri cua bieu thuc sau
        //y = 3x^2 +5x-1

        Consumer<Double> y = x -> {
            double y1 = 3*x*x +5*x -1;
            System.out.println(y1);
        };
        for (double n: numbers) {
            y.accept(n);
        }

        //Tang gtai len gap doi
        Consumer<List<Double>> f = new Consumer<List<Double>>() {
            @Override
            public void accept(List<Double> doubles) {
                for(int i =0; i< doubles.size();i++){
                    doubles.set(i, 2*doubles.get(i));
                }
            }
        };
        f.accept(numbers);
        System.out.println(f);
        System.out.println(numbers);

    }
}
