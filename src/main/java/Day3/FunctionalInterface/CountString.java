package Day3.FunctionalInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountString {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        s= in.nextLine();

        IStringtoInt string = s4 -> s4.length();

        IStringtoInt string1 = new IStringtoInt() {
            @Override
            public int CountString(String s1) {
                int count = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != ' ') {
                        count++;
                    }
                }
                return count;
            }
        };
        System.out.println("So ki tu cua chuoi: "+ string1.CountString(s));
        System.out.println("So ki tu cua chuoi: "+ string.CountString(s));

        IStringtoInt string2 = new IStringtoInt() {
            @Override
            public int CountString(String s2) {
                int count = 0;
                boolean notCounted = true;
                for (int i = 0; i < s2.length(); i++) {
                    if (s2.charAt(i) != ' ') {
                        if(notCounted) {
                            count++;
                            notCounted = false;
                        }
                    } else {
                        notCounted = true;
                    }
                }
                return count;
            }
        };
        System.out.println("So tu trong chuoi: "+ string2.CountString(s));

        IStringtoInt string3 = new IStringtoInt() {
            @Override
            public int CountString(String s3) {
                int count = 0;
                char kyTu1 = 'a', kyTu2 = 'A';
                for (int i = 0; i < s3.length(); i++) {
                    if (s3.charAt(i) == 'a' || s3.charAt(i) == 'A') {
                        count++;
                    }
                }
                return count;
            }
        };
        System.out.println("So tu a, A trong chuoi: "+ string3.CountString(s));

        IStringtoInt string4 = new IStringtoInt() {
            @Override
            public int CountString(String s4) {

                Set<Character> characters = new HashSet<>();
                for (int i = 0; i < s4.length(); i++) {
                    characters.add(s4.charAt(i));
                }
                return characters.size();

                /*String s4new = new String();
                for (int i = 0; i < s4.length(); i++) {
                    for(int j =0; j< s4new.length(); j++){
                        if(s4.charAt(i) != s4new.charAt(j)){
                            s4new += s4.charAt(i);
                        }
                    }
*//*                    if (!s4new.contains(s4[i])) {
                            s4new += s4.charAt(i);
                    }*//*
                }*/
            }
        };
        System.out.println("So ki tu ( khong lap lai )cua chuoi: "+ string4.CountString(s));

    }
}
