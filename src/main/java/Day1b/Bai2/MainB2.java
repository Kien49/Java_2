package Day1b.Bai2;

public class MainB2 {
    public static void main(String[] args) {
        ITinhToan<SoPhuc> soPhuc1 = new TinhToanSoPhuc();

        SoPhuc sp1 = new SoPhuc(2, 3);
        SoPhuc sp2 = new SoPhuc(4, 5);
        SoPhuc sp3 = new SoPhuc(6, 7);

        SoPhuc t1 = soPhuc1.cong(sp1, sp2, sp3);
        SoPhuc t2 = soPhuc1.tru(sp1 , sp2);
        SoPhuc t3 = soPhuc1.nhan(sp2 , sp3);
        SoPhuc t4 = soPhuc1.chia(sp1, sp3);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}
