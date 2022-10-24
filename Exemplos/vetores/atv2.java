package Exemplos.vetores;
import java.util.*;
//2. Faca um Programa que lela um vetor de 10 ntimeros reais e mostre-os na ordem
//inversa.
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] vet = new double [10]; 
        
        System.out.print("Digite 10 vezes: \n");
        for(int i=0;i<10; i++)  {
            vet[i] = sc.nextInt();
        }
            sc.close();
        for(int i=9;i>=0; i--)  {
            System.out.print(" - "+vet[i]);
        }
    }
    
}
