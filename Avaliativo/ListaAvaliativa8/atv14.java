package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat = new int [3][3];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i>j)  {
                    mat[i][j] = (2*i)+(7*j)-2;
                } else if (i==j)    {
                    mat[i][j] = (3*(i*i))-1; 
                } else if (i<j) {
                    mat[i][j] = (4*(i*i*i)-(5*(j*j)))+1;
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
    }
}
