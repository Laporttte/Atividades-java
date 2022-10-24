package Laboratorio.Lista8;
import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("N1: ");
            n1 = sc.nextInt();
        System.out.print("N2: ");
            n2 = sc.nextInt();
            sc.close(); 
        
        System.out.print("Soma: "+ somaBetween(n1, n2));
    }
    static int somaBetween(int n1, int n2) {
        int soma = 0;
        for (int i=n1; i<=n2;i++) {
            soma+=i;
        }
        return soma;
    }
    
}
