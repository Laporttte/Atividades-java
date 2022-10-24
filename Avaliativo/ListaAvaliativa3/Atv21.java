package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, mult=1, soma=0;   //mult nao pode ser 0, se nao a multiplicao da 0        System.out.print("Digite o menor nº: ");
        System.out.print("Digite o menor nº: ");
            a = sc.nextInt();
        System.out.print("Digite o maior nº: ");
            b = sc.nextInt();
        for(int x=a;x<=b; x++)  {
            if (x%2==0) {
                soma += x;
            } else {
                mult = mult*x; 
            }
        }
            sc.close();
        System.out.print("\nSoma: "+soma+"\nMultiplicação: "+mult);
    }
}
