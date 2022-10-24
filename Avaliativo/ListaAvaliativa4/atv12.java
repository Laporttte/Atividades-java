package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        boolean op=true;
        while(op) {
            System.out.print("Digite o num: ");
                num = sc.nextFloat();
            if (num > 0) {
                System.out.println("\nQuadrado: "+num*num);
                System.out.println("Cubo: "+num*num*num);
                System.out.println("Raiz quadrada: "+Math.sqrt(num));
            } else {
                op = false;
            }
        }
        sc.close();
    }
}
