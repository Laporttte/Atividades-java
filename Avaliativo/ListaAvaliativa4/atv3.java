package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, j, i;

        System.out.println("Valor de num: ");
        num = sc.nextInt();
        System.out.println("Valor de i: ");
        i = sc.nextInt();
        System.out.println("Valor de j: ");
        j = sc.nextInt();
        sc.close();
        for (int x=0; x<=num; x++)    {
            if (x%i==0 || x%j==0)    {
                System.out.print(x+", ");
            }
            x++;
        }

    }
}
