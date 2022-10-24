package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv4 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double num, quinta;

        System.out.print("Número real: ");
            num = sc.nextDouble();
            sc.close();
        quinta = (num/5);
        System.out.print("Quinta parte: "+quinta);

    }
    
}
