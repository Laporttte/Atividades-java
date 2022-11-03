package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] vet = new int [20];
        boolean igual=false;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
            sc.close();
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if ((vet[i]==vet[j])&&(i!=j)) {
                    igual=true;
                }
            }
            if (igual==false)   {
                System.out.print(" - "+vet[i]);
            }
            igual=false;
        }
         
    }
}
//Leia um vetor com 20 numeros inteiros.
// Escreva os elementos do vetor eliminando elementos repetidos.