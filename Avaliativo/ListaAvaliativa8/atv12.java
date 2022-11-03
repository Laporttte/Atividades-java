package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat = new int [5][5];
        int num=0, lin=0, col=0;
        boolean found = false;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o numero para ser encontrado: ");
            num = sc.nextInt();
            sc.close();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==num) { //se encontrar
                    found=true;
                    lin=i;  col=j;
                }
            }
        }
        if (found == true)  {
            System.out.print("O numero "+num+" está em: "+ lin+", "+col);
        } else {
            System.out.print("Não encontrado.");
        }

        }
}