package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv11 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double salBase, sal;

        System.out.print("Salário base: ");
            salBase = sc.nextDouble();
            sc.close();
            sal = salBase + (salBase*0.05) - (salBase*0.07);
        System.out.print("O salário com gratificação e desconto é: "+ sal);

    }
    
}
