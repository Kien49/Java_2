package Day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");

        HinhTron ht = new HinhTron(in.nextInt());
        System.out.printf("Chu vi: %.3f\n", ht.tinhChuVi());
        System.out.printf("Dien tich: %.3f", ht.tinhDienTich());
    }
}
