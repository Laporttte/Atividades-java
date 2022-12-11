package Laboratorio.Lista13;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite o numero: ");
            num = sc.nextInt();
            sc.close();
        System.out.print("O numero é positivo?\n  "+NegaPosi(num));
    }
    public static boolean NegaPosi(int num) {
        if (num>0) {
            return true;
        }
        return false;
    }
}
