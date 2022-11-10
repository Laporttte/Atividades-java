package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] A = new int [10];
        int [] B = new int [10];
        int [] C = new int [10];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i]+B[i];
        }
            sc.close();
        for (int i = 0; i < C.length; i++) {
            System.out.print(" "+C[i]);
        }
    }
}
