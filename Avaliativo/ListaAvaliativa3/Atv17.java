package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x=0, soma=0;
        System.out.print("Digite o valor de N: ");
            N = sc.nextInt();
            sc.close();
        while (x<=N) {
            soma+= x;
            x++;
        }
        System.out.println(soma);
    }
}
