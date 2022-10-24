package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv23 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Número: ");
            num = sc.nextInt();
            sc.close();
        for (int x=1;x<=num;x++)    {
            if(num%x==0)    {
                System.out.print(" "+x);
            }
        }
    }
    
}
