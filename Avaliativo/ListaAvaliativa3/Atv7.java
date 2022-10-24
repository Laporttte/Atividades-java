package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv7 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int pos=0, x=0, num;
        while (x<10)    {
            System.out.println("Digite: ");
            num = sc.nextInt();
            if (num>0)  {
                pos+= num;
                x++;
            }
        }
        sc.close();
        System.out.print("Média dos nº positivos: "+(pos/10));
    }
}
