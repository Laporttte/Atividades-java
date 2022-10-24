package Laboratorio.Lista8;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Valor de n: ");
            n = sc.nextInt();
            sc.close();
        System.out.println("Fatorial = "+fat(n));
    }
    static int fat (int n)  {
        int fatorial=1;

        for(int i=n; i!=1;i--)  {
            fatorial *=i;
        }
        return fatorial;
    }
    
}
