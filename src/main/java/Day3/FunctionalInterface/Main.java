package Day3.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        MyFunctional sum= new MyFunctional() {
            @Override
            public double caculator(double a, double b) {
                return a+b;
            }
        };
        System.out.println("Tong 3,5 la " + sum.caculator(3.0,5.0));

        //Tinh A = 5*a + 3*b -10;

        MyFunctional bt = new MyFunctional() {
            @Override
            public double caculator(double a, double b) {
                return 5*a + 3*b -10;
            }
        };
        System.out.println("bt 3,5 la " + bt.caculator(3.0,5.0));

    }
    //Thuong dinh nghia trong TH can dung den
    // Thuong ket hop voi StreamAPI va Lambda Expression
}
