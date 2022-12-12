package Laboratorio.Lista14;

import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str1, str2;
        int n;
        
        System.out.println("Str1: ");
            str1 = sc.nextLine();
        System.out.println("Str2: ");
            str2 = sc.nextLine();
        System.out.println("N: ");
            n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            str1 += str2.charAt(i);
        }
        str1+="0";

        System.out.println(str1);
        sc.close();
    }
}
