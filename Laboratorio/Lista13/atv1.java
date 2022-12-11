package Laboratorio.Lista13;

import java.util.*;;

public class atv1 {
    public static void main(String[] args) {
        int vet [] = new int [10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
                vet[i] = sc.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
        }
        System.out.print("\n");
        for (int i = vet.length-1; i>-1; i--) {
            System.out.print(" "+vet[i]);
        }
        sc.close();
    }
}
