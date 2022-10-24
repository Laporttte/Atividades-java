package Laboratorio.Lista5;

import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont=1, primo=1, cont_impar=1, cont_par=-2;
        System.out.println("Digite o valor de n:");
            n = sc.nextInt();
            sc.close();

        System.out.print("1º sequencia: ");
        for (int i=1;i<=n;i++)   {
            System.out.print(i+" ");
        }

        System.out.print("\n2º sequencia: ");
        while(cont<(n*2))   {
            if (cont%2!=0)  {
            System.out.print(2*cont_impar-1);
            System.out.print(" ");
            cont_impar++;
            }
            else if (cont%2==0) {
            System.out.print((2*(cont_par/2)));
            System.out.print(" ");
            cont_par-=2; 
            }
            cont++;
        }

        System.out.print("\n3º sequencia: ");
        while (((2*primo)-1)<(2*n)){
            System.out.print(((2*primo)-1)+" ");
            primo++;
        }
    }
    
}
