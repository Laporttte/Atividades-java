package Laboratorio.Lista2;
import java.util.*;
public class Atv3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Escreva um número: ");
            num = sc.nextInt();
        if (num%2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é impar");
        }
            sc.close();
        }
}
