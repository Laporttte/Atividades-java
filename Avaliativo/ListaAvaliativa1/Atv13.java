package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv13 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num, x=0;

        System.out.print("Número inteiro: ");
            num = sc.nextInt();
            sc.close();
        
            String str = String.valueOf(num);

        while (4>x)    {
            System.out.println(str.charAt(x));
            x++;
        }

    }
    
}
