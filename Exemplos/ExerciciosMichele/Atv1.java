package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
    int a, b;
    /*int soma = a+b, produto =  a*b, diferença = a-b, quociente = a/b;
        porque não deu pra usar as variaveis com a soma?*/
        System.out.println("Digite o primeiro numero para os calculos:");
            a = sc.nextInt();
        System.out.println("Digite o segundo numero para os calculos:");
            b = sc.nextInt();
        System.out.printf("\nA soma é: " +(a+b)+ "\nA diferença é: " +(a-b)+ "\nO produto é: " +(a*b)+ "\nO quociente é: " +(a/b));
        sc.close();

    }   
}       
