package Exemplos;
import java.util.*;
public class atvFlavio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mat = new int [10];
        int pares=0;
        for (int i = 0; i < mat.length; i++) {
            mat[i] = sc.nextInt();
            if(mat[i]%2==0) {
                pares++;
            }
        }
        sc.close();
        System.out.println("Quantidade de pares: "+pares);
    }
}
