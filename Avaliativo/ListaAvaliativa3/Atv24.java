package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv24 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num, soma=0;
        System.out.print("Número: ");
            num = sc.nextInt();
            sc.close();
        for (int x=1;x<num;x++)    {
            if(num%x==0)    {
                soma += x;
            }
        }
        System.out.println(soma);
    }
    
}
