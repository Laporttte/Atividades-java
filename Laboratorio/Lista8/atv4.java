package Laboratorio.Lista8;
import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite n: ");
            n = sc.nextInt();
        
        System.out.print("é primo? "+identificaPrimos(n));
        sc.close();
    }
    static int identificaPrimos(int n) {
        boolean conf=true;
        int quant=0;
        for(int x=1;x<n;x++)    {
        for (int i=2; i<x; i++) {
            if (x%i==0) {
            conf=false;
            System.out.print(" - "+x);
            }
        }
        if(conf==true) {
            quant++;
        }
    }
    return quant;
}
}
