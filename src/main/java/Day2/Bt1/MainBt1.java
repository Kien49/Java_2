package Day2.Bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainBt1 {

    public static void main(String[] args) {
        List<SinhVien> arrayListSV = new ArrayList<>();

        SinhVien s1 = new SinhVien("1", " SV1", "01", "HaNoi");
        arrayListSV.add(s1);
        SinhVien s2 = new SinhVien("2", " SV2", "02", "HaNoi");
        arrayListSV.add(s2);
        SinhVien s3 = new SinhVien("3", " SV3", "03", "HaNam");
        arrayListSV.add(s3);

        System.out.println("-----Danh sach SV-----");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----Nhap in4 Sv moi----");
        SinhVien sNew = new SinhVien();
        Scanner in= new Scanner(System.in);
        System.out.print("maSv:");
        sNew.setMaSv(in.nextLine());

        System.out.print("tenSv:");
        sNew.setTenSv(in.nextLine());

        System.out.print("ngaySinh:");
        sNew.setNgaySinh(in.nextLine());

        System.out.print("queQuan:");
        sNew.setQueQuan(in.nextLine());

        System.out.println(sNew);

        arrayListSV.add(sNew);

        //3
        System.out.print("---Nhap ID tim kiem sv---:");
        String id = in.nextLine();
        int countTemp =0;
        for (SinhVien sv: arrayListSV) {
            countTemp++;
            if(sv.timKiemTheoId(id)){
                System.out.println(sv);
                break;
            }else{
                if(countTemp == arrayListSV.size()){
                    System.out.println("Khong thay maSv !!!!!");
                }
            }
        }

        //4
        List<MonHoc> arrayListMH = new ArrayList<>();

        MonHoc mh1 = new MonHoc("1", "Toan");
        arrayListMH.add(mh1);
        MonHoc mh2 = new MonHoc("2", "Ly");
        arrayListMH.add(mh2);
        MonHoc mh3 = new MonHoc("3", "Hoa");
        arrayListMH.add(mh3);

        System.out.println("----Danh sach MonHoc----");
        System.out.println(mh1);
        System.out.println(mh2);
        System.out.println(mh3);

        //5
        System.out.println("----Nhap MonHoc moi----");
        MonHoc mhNew = new MonHoc();
        System.out.print("maMh:");
        mhNew.setMaMonHoc(in.nextLine());

        System.out.print("tenMh:");
        mhNew.setTenMonHoc(in.nextLine());

        System.out.println(mhNew);

        arrayListMH.add(mhNew);

        //6 7 8
        System.out.println("-----Nhap Diem Mon Hoc Cho Sinh Vien-----");
        System.out.print("Nhap ID Sinh Vien:");
        String id1 = in.nextLine();
        countTemp =0;
        for (SinhVien sv: arrayListSV) {
            countTemp ++;
            if(sv.timKiemTheoId(id1)){
                int maMH =0;
                System.out.print("Chon mon bang maMonHoc:");
                maMH = in.nextInt();

                int diem =0;
                System.out.print("Nhap Diem:");
                diem = in.nextInt();
                Diem diemSv = new Diem(sv.getMaSv(),sv.getTenSv(), sv.getNgaySinh(),sv.getQueQuan(), sv.getMaSv(), "maMH", diem);
                System.out.println(diemSv);
                break;
            }else{
                if(countTemp == arrayListSV.size()){
                    System.out.println("Khong thay maSv !!!!!");
                }
            }
        }

    }


}
