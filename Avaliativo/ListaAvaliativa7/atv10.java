package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] reais = new double [10];
        int quant=0, soma=0;

        System.out.println("Digite: ");
        for (int i = 0; i < reais.length; i++) {
            reais[i] = sc.nextDouble();
            if (reais[i] > 0) {
                soma+=reais[i];
            }
            else if (reais[i] < 0)  {
                quant++;
            }
        }
            sc.close();
        System.out.print("\nSoma: "+soma+"\nQuant. negativos: "+quant);
        
    }
}
/*
 Fac¸a um programa que preencha um vetor com 10 numeros reais, calcule e mostre a quantidade de ´
numeros negativos e a soma dos n ´ umeros positivos desse vetor.
 */