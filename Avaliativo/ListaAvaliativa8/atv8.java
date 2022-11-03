package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int [4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
            sc.close();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               if(mat[i][j]>10) {
                    System.out.println(" "+mat[i][j]);
               }
            }
        }
    }
}
