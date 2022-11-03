package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int [5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = i*j;
            }
        }
            sc.close();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("  "+mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
