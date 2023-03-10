package Day2.b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //Tao 1 set chua cac chuoi duoc nhap tu ban phim
        Scanner in = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while(true){
            System.out.print("Enter your string: ");
            String tmp = in.nextLine();
            if(tmp.equalsIgnoreCase("exit")) break;
            stringSet.add(tmp);
            System.out.println(stringSet);
        }
        in.close();
    }
}
