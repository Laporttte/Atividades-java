package Laboratorio.Lista7;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont=1;

        System.out.print("Digite n: ");
            n=sc.nextInt();
            sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++)  {
                System.out.print(cont+" ");
                cont++;
            }
            System.out.print("\n");
        }
    }
}
