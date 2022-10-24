package Avaliativo.ListaAvaliativa6;

import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("N = ");
            N = sc.nextInt();
            sc.close();
        
        System.out.print(somatorio(N));
    }
    public static int somatorio(int N) {

        if(N==1) {
            return 1;
        }
         return N + somatorio(N-1);
        
    }
}
