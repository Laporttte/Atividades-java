package Laboratorio.Lista1;
import java.util.*;
public class Atv4 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float num, num_q, num_c;
        double num_raiz_q, num_raiz_c;

        System.out.print("Escreva um número positivo e maior que zero: ");
            num = sc.nextFloat();
        if (num<=0) {
            System.out.print("Esse número é inválido.\n\n");
            main(args); //Evitar que se a entrada de numeros errados (mais facil que while e etc.)
         }
            sc.close();
        num_q = num*num;
        num_c = num*num*num;
        num_raiz_q = Math.sqrt(num);
        num_raiz_c = Math.cbrt(num);

        System.out.println("\nO número ao quadrado é: "+ num_q);
        System.out.println("O número ao cubo é: "+ num_c);
        System.out.println("A raiz cubica do número é: "+ num_raiz_c);
        System.out.println("A raiz quadrada do número é: "+ num_raiz_q);
    }
}
