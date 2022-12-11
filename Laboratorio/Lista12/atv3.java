package Laboratorio.Lista12;

import java.util.*;;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha, coluna;
        System.out.print("digite a linha, click enter e depois coluna\n");
        linha = sc.nextInt();        coluna = sc.nextInt();

        int mat1 [][] = new int [linha][coluna];
        int mat2 [][] = new int [linha][coluna];
        int matSoma [][] = new int [linha][coluna];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
            mat1 [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
            mat2 [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                matSoma [i][j] = mat1 [i][j] + mat2 [i][j];
            }
        }

        System.out.print("Matriz somada: \n");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(matSoma [i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
