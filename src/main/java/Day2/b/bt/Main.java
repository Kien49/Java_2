package Day2.b.bt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<IHinhHoc3D> arrHinh = new ArrayList<>();

        int n,m;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so hinh cau:");
        n = in.nextInt();

        List<HinhCau> arrHinhCau = new ArrayList<>();

        for(int i =0; i< n; i++){
            System.out.printf("Nhap ban kinh Hinh %d: ", i+1);
            double banKinh = in.nextFloat();
            arrHinhCau.add(new HinhCau(banKinh));
        }

        System.out.print("Nhap so hinh lap phuong:");
        m = in.nextInt();

        List<HinhLapPhuong> arrHinhLapPhuong = new ArrayList<>();

        for(int i =0; i< m; i++){
            System.out.printf("Nhap Canh Hinh %d: ", i+1);
            double canh = in.nextFloat();
            arrHinhLapPhuong.add(new HinhLapPhuong(canh));
        }

        arrHinh.addAll(arrHinhCau);
        arrHinh.addAll(arrHinhLapPhuong);

        System.out.println(arrHinh);

        double minV = arrHinh.get(0).tinhTheTich();
        int pos =0;
       double sum=0, tb =0;
        for(int i =0; i< arrHinh.size(); i++){
            if(minV > arrHinh.get(i).tinhTheTich()){
                minV = arrHinh.get(i).tinhTheTich();
                pos =i;
            }
            sum += arrHinh.get(i).tinhTheTich();
        }
        System.out.println(arrHinh.get(pos));
        System.out.printf("The tich tb: %.1f", sum/tb);

        /*for(int i =0; i< arrHinh.size()-1; i++){
            for(int j =i+1; j< arrHinh.size(); j++){
                if( arrHinh.get(i).tinhTheTich() > arrHinh.get(j).tinhTheTich()){
                    double tmp = arrHinh.get(i).tinhTheTich();
                    arrHinh.get(i).tinhTheTich() = arrHinh.get(j).tinhTheTich();
                    arrHinh.get(j).tinhTheTich() = tmp;
                }
            }

        }*/
        Collections.sort(arrHinh, new Comparator<IHinhHoc3D>() {
            @Override
            public int compare(IHinhHoc3D o1, IHinhHoc3D o2) {
                if(o1.tinhTheTich() > o2.tinhTheTich()){
                    return 1;
                } else if(o1.tinhTheTich()< o2.tinhTheTich()){
                    return -1;
                }
                return 0;
            }

        });
        System.out.println(arrHinh);



    }
}
