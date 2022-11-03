package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv6incompletra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [5];
        int [] vetImpares = new int [5];
        int aux=55;

        for (int i = 0; i < vet.length; i++) {
            while (aux<0 || aux>50) {
                aux = sc.nextInt();
            }
            vet[i] = aux;

            if (vet[i]%2!=0)    {
                vetImpares[i]=vet[i];
            }
        }
            sc.close();
        System.out.println("Vetor normal");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
            if(i%2==0)
                System.out.print("\n");
        }
        System.out.println("Vetor impar");
        for (int i = 0; i < vetImpares.length; i++) {
            if(vet[i]!=0)
                System.out.print(" "+vet[i]);
            if(i%2==0)
                System.out.print("\n");
        }
    }
}

