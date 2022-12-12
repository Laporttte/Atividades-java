package Laboratorio.Lista14;

import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str1, str2;
        
        System.out.println("Str1: ");
            str1 = sc.nextLine();
        System.out.println("Str2: ");
            str2 = sc.nextLine();
        
        if (str1.substring((str1.length()-str2.length()), str1.length()).equals(str2)) {
            System.out.println("Tem");
        } else {
            System.out.println("Nao tem");
        }

        System.out.println(str1);
        sc.close();
    }
}
