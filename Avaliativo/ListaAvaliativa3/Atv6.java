package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int x=1, num=0;
        while (x<=10)    {
            System.out.print("Digite: ");
            num+= sc.nextInt();
            x++;
        }
        sc.close();
        System.out.println("A média é : "+(num/10));
    }
}
