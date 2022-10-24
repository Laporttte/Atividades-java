package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor, maior, soma=0;
        System.out.println("Digite o menor valor: ");
        menor = sc.nextInt();
        System.out.println("Digite o maior valor: ");
        maior = sc.nextInt();
        sc.close();
        if (menor<maior) {
        for (int i=menor; i<maior; i++) {
                if (i%2!=0) { // impares
                    soma +=i;
                }
            }
            System.out.println("A soma é: "+soma);
        } else {
            System.out.println("Intervalos de valores inválido.");
        }
    }
}
