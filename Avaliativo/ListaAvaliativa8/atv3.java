package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [10];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] < 0) {
                vet[i] = 0;
            }
        }
            sc.close();
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
        }
    }
}
//Leia um vetor de 10 posic ̧ ̃oes e atribua valor 0 para todos os elementos que possu ́ırem valores negativos.1