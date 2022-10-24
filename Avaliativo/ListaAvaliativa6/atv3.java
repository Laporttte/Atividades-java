package Avaliativo.ListaAvaliativa6;

import java.util.*;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("N = ");
            N = sc.nextInt();
            sc.close();

        System.out.print("Soma dos "+N+" cubos:"+somaCubos(N));
    }
    public static int somaCubos(int N) {
        if (N==1)   {
            return 1;
        }
        return  N*N*N+somaCubos(N-1);
    }
}
