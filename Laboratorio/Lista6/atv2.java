package Laboratorio.Lista6;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, soma = 0;

        System.out.print("A: ");
        a = sc.nextInt();
        System.out.print("B: ");
        b = sc.nextInt();
        sc.close();
        for (int i = a; i < b; i++) { 
            boolean primo = true;
            if (i!=1)   { 
                for (int j = 2; j < i; j++) { 
                    if (i % j == 0) {   
                        primo = false;
                        break;
                    }
                }
                if (primo == true) { 
                    System.out.print(i+" ");
                    soma+=i;
                }
            }
        }
        System.out.print("\nSoma: " + soma);
    }
}