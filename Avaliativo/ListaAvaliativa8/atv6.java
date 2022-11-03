package Avaliativo.ListaAvaliativa8;
import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [5];
        int NumAux=51, contImpares=0, auxVet=0;

        for (int i = 0; i < vet.length; i++) {
            while (NumAux<0 || NumAux>50) {
                NumAux = sc.nextInt();
            }
            vet[i] = NumAux;

            if (vet[i]%2!=0)    {
                contImpares++;
               // System.out.println("impar: "+vet[i]);
            }
            NumAux=51;
        }
            sc.close();
        //System.out.println("Teve impares?  "+contImpares);
        int [] vetImpares = new int [contImpares];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i]%2!=0)    {
                vetImpares[auxVet]=vet[i];
                auxVet++;
            }
        }

        System.out.println("Vetor normal");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
            if(i%2!=0)
                System.out.print("\n");
        }
        System.out.println("\nVetor impar");
        for (int i = 0; i < vetImpares.length; i++) {
                System.out.print(" "+vetImpares[i]);
            if(i%2!=0)
                System.out.print("\n");
        }
    }
}

