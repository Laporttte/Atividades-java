package Avaliativo.ListaAvaliativa5;
import java.util.*;

public class atv4 {
    public static void main(String[] args) {
    
        leitura();

    }
    public static void leitura()    {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Valor de a: ");
            a = sc.nextDouble();
        System.out.print("Valor de b: ");
            b = sc.nextDouble();
            sc.close();
        
        System.out.println(atv3.hipotenusa(a, b)); 
        
    }
 
}
