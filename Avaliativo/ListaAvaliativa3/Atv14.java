package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv14 { //pares >0 decrescente
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Digite o valor de N: ");
            N = sc.nextInt();
            sc.close();
        for (int x=N; x>1; x--) {
            if (x%2==0) {
            System.out.print(" "+x);
            }
        }
    }   
}
