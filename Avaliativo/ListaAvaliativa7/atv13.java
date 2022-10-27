package Avaliativo.ListaAvaliativa7;
import java.util.*;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [5];
        int quant=0, valor=0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i]==vet[j]) {
                    quant++;
                    valor = vet[i];
                }
            }
            if (quant>1)  {
                System.out.println("Tem: "+valor);
                quant=0;
            } else {
                quant=0;
            }
                
        }
      
    }
}
/*
  Fac¸a um programa que leia um vetor de 10 posic¸oes e verifique se existem valores iguais e os escreva na ˜
tela.
 */
