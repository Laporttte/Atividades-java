package Exemplos;

import java.util.*;
public class teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, soma = 0;

        System.out.print("Numero: ");
        a = sc.nextInt();
        sc.close();
        for (int i = 1; i < a; i++) { 
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
