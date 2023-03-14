package Day3.Bt1;

import java.util.*;

public class DanhBa {
    private static void mainMenu() {
        System.out.println("--------QUAN LY DANH BA--------");
        System.out.println("1. Them danh ba");
        System.out.println("2. Cap nhat ten danh ba");
        System.out.println("3. Xoa danh ba theo sdt");
        System.out.println("4. Xem toan bo danh ba");
        System.out.println("5. Thoat");
    }
    public static void main(String[] args) {
        Map<Sdt, Name> danhBa = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int option = -1;

        do {
            mainMenu();
            System.out.print("Nhập lựa chọn: ");
            // Nhập dữ liệu
            try {
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng");
                continue;
            }
            // Kiểm tra xem người dùng nhập lựa chọn nào?
            if (option < 1 || option > 5) {
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }
            switch (option) {
                case 1:
                    //int n;
                    Name name = new Name();
                    Sdt sdt = new Sdt();
                    //System.out.print("Nhập So danh ba can them: ");
                    //n = in.nextInt();
                   /* for(int i=0; i< n;i++)
                    {

                    }*/
                    System.out.print("Name danh ba : ");
                    name.setName(in.nextLine());
                    System.out.print("Sdt danh ba : ");
                    sdt.setNumberSdt(in.nextLine());
                    danhBa.put(sdt, name);

                    break;
                case 2:
                    System.out.print("Thay doi ten danh ba so may: ");
                    int numberChange ;
                    numberChange = in.nextInt();
                    for (int i = 1; i <= danhBa.size() ; i++) {
                        if(numberChange == i){
                            //Name name1  = new Name()
                            //Name nameNew = new danhBa.get();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap sdt: ");
                    String sdtNumber ;
                    sdtNumber = in.nextLine();
                    for (int i = 1; i <= danhBa.size() ; i++) {
                        if(sdtNumber.equals(danhBa.keySet())){

                        }
                    }

                    break;
                case 4:
                    for (Sdt phone: danhBa.keySet()) {
                        System.out.printf("");
                    }
                    System.out.println(danhBa);
                    break;
                case 5:
                    break;
            }

        }
        while (option != 0);
        in.close();

    }
}
