package Laboratorio.Lista13;
import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite o numero: ");
            num = sc.nextInt();
            sc.close();
        System.out.print("Fat:"+fat(num));
    }
    public static int fat(int num) {
        if (num<1) {
            return 1;
        }
        return fat(num-1)*num;
    }
}
