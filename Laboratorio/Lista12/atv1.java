package Laboratorio.Lista12;

import java.util.*;;

public class atv1 {
    public static void main(String[] args) {
        float mat [][] = new float [50][50];
        float vet [] = new float [50];
        int x=0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = sc.nextFloat();
                if(i==j)    {
                    vet [x] = mat[i][j];
                    x++;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
        }
        sc.close();
    }
}
