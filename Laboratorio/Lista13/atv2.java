package Laboratorio.Lista13;

import java.util.*;;

public class atv2 {
    public static void main(String[] args) {
        int mat [][] = new int [10][15];
        int somaTemp=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                somaTemp+=mat[i][j];
            }
            System.out.println("Linha "+(i+1)+": "+somaTemp+" - "+ImparPar (somaTemp)); 
            somaTemp=0;
        }
    System.out.println("\n");
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                somaTemp+=mat[i][j];
            }
            System.out.println("Coluna "+(j+1)+": "+somaTemp+" - "+ImparPar (somaTemp)); 
            somaTemp=0;
        }
        sc.close();
    }
    public static String ImparPar (int somaTemp) {
        if(somaTemp%2==0)   {
            return "par";
        }
        return "impar";
    }
}
