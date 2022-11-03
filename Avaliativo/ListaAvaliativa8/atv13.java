package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] mat1 = new int [1][1];
        int [][] mat2 = new int [1][1];

        System.out.print("1ª matriz:");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1 [i][j] = sc.nextInt();
            }
        }
        System.out.print("2ª matriz:");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat2 [i][j] = sc.nextInt();
            }
        }
    }
}
