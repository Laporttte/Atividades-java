package Laboratorio.Lista9;
import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] vet = new int [5];
        for (int i = 0; i < vet.length; i++) {
            vet [i] = sc.nextInt();
        }
        imprimeSerie(vet,0);
        sc.close();
    }
    public static void imprimeSerie(int [] vet, int p)  {
        if (p==vet.length-1)    {
            System.out.print(vet[p]);
        } else {
            System.out.print(vet[p]+" ");
            imprimeSerie(vet, p+1);
        }
    }
}
