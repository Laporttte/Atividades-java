import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] mat = new int [3][3];
        int soma=0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
                if (i<j)    {
                    soma+= mat[i][j];
                }
            }
        }
        System.out.println("Soma = "+soma);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
