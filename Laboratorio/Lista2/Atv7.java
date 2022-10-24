package Laboratorio.Lista2;
import java.util.*;
public class Atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
            num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("O número é par. Soma = " + (num+5));
        } else if (num % 2 != 0){
            System.out.print("O número é impar. Soma = " + (num+8));
        }
        sc.close();
    }
    
}
