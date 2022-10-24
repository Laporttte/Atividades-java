package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv15 { //impares > 1 crescente
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Digite o valor de N: ");
            N = sc.nextInt();
            sc.close();
        for (int x=1; x<=N;x++)  {
            if(x%2!=0)  {
            System.out.print(" "+x);
            }
        }
    }   
}
