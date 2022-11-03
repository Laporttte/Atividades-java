package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat = new int [4][4];
        int maiorL=0, maiorC=0, maior=0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
                if(i==0)    {
                    maior=mat[i][j];
                    maiorL=i; maiorC =j;
                }
                if(mat[i][j]>maior) {
                    maior=mat[i][j];
                    maiorL=i; maiorC =j;
                }
            }
        }
            sc.close();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" "+mat[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("O maior valor está na posição: "+maiorL+", "+maiorC);
    }
}
