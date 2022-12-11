package Laboratorio.Lista12;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha, coluna;
        System.out.print("digite a linha, click enter e depois coluna\n");
        linha = sc.nextInt();        coluna = sc.nextInt();
        int mat [][] = new int [linha][coluna];
        int matTrans [][] = new int [linha][coluna];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
                matTrans[j][i] =  mat[i][j];
            }
        }
        System.out.print("mat normal\n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("mat transposta\n");
        for (int i = 0; i < matTrans.length; i++) {
            for (int j = 0; j < matTrans[0].length; j++) {
                System.out.print(matTrans[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();

    }
}
