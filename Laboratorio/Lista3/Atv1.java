package Laboratorio.Lista3;
import java.util.*;
public class Atv1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num, c1, c2, c3;

        System.out.print("Escreva um número de três digitos: ");
            num = sc.nextInt();
            sc.close();
        if (num <= 0)   {
            System.out.print("O número digitado é inválido.");
        }   else {
            c1 = (num % 100) /10;
            c2 = (num % 10);
            c3 = num /100;
            System.out.print("A soma dos três números é: "+(c1+c2+c3));
        }
    }
}