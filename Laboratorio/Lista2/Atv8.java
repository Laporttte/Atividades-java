package Laboratorio.Lista2;
import java.util.*;
public class Atv8 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Escreva o valor de n1: ");
            n1 = sc.nextInt();
        System.out.print("Escreva o valor de n2: ");
            n2 = sc.nextInt();
        System.out.print("Escreva o valor de n3: ");
            n3 = sc.nextInt();
        // n1 maior ou n2 ou n3 medio
        if (n1>n2 && n1>n3 && n2>n3)   {
            System.out.print(n1 + " - " + n2 + " - " + n3);
        }
        if (n1>n2 && n1>n3 && n3>n2)   {
            System.out.print(n1 + " - " + n3 + " - " + n2);
        } //n2 maior e n1 ou n3 medio
        if (n2>n1 && n2>n3 && n1>n3)   {
            System.out.print(n2 + " - " + n1 + " - " + n3);
        }
        if (n2>n1 && n2>n3 && n3>n1)   {
            System.out.print(n2 + " - " + n3 + " - " + n1);
        } // n3 maior e n1 ou n2 medio
        if (n3>n1 && n3>n2 && n1>n2)   {
            System.out.print(n3 + " - " + n1 + " - " + n2);
        }
        if (n3>n1 && n3>n2 && n2>n1)   {
            System.out.print(n3 + " - " + n2 + " - " + n1);
        }
        sc.close();
    }
}
