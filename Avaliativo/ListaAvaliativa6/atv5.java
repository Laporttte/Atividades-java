package Avaliativo.ListaAvaliativa6;

import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Numero = ");
            num = sc.nextInt();
            sc.close();
            System.out.print("fibonacci: "+fibo(num));

        }
    public static int fibo(int num) {

        if (num==1 || num==2) {
            return 1;
        }

        return fibo(num-1)+fibo(num-2);

    }
}