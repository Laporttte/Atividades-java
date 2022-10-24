package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv12 { //naturais decrescente
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Digite o valor de N: ");
            N = sc.nextInt();
            sc.close();
        for (int x=N; x>=0; x--) {
            System.out.print(" "+x);
        }
    }   
}
