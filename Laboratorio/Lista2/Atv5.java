package Laboratorio.Lista2;
import java.util.*;
public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
            num = sc.nextInt();
            sc.close();

        if (num > 0) {
            System.out.print("O número é positivo. Dobro = " + (num*2));
        } else if (num < 0){
            System.out.print("O número é negativo. Triplo = " + (num*3));
        }
    }
}
