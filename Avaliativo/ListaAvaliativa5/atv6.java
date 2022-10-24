package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, maior;

        System.out.print("Digite num1: ");
            num1 = sc.nextInt();
        System.out.print("Digite num2: ");
            num2 = sc.nextInt();
            sc.close();

        maior = verificaMaior(num1, num2);
        if (maior == -971) {
            System.out.print("São iguais!");
        } else {
            System.out.print("O maior é "+maior);
        }
    }
    public static int verificaMaior(int num1, int num2) {

        if (num1>num2) {
            return num1;
        } else if (num2>num1) {
            return num2;
        } else {
            return -971;
        }
    }
    
}
