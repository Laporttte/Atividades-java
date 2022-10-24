package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv18 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double num, desconto;

        System.out.print("Valor do produto: ");
            num = sc.nextDouble();
            sc.close();
            desconto = num*0.12;
            num = num - desconto;

        System.out.printf("O valor com desconto: "+"%.2f", num);

    }
    
}
