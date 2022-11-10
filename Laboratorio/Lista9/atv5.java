package Laboratorio.Lista9;
import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] vet = new int [5];
        for (int i = 0; i < vet.length; i++) {
            vet [i] = sc.nextInt();
        }
        int menor = menorNoVetor(vet,0, vet[0]);
        System.out.println("Menor: "+menor);
        sc.close();
    }
    public static int menorNoVetor(int [] vet, int p, int menor)  {
        if (vet[p]<menor)    {
        menor=vet[p];
        } 
        if (p==vet.length-1){
            return menor;
        } else {
            return menorNoVetor(vet, p+1, menor);
        }
    }
}
