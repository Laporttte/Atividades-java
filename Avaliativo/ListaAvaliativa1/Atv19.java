package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv19 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double num, aumento;

        System.out.print("Escreva o salário: ");
            num = sc.nextDouble();
            sc.close();
            aumento = num*0.25;
            num = num + aumento;

        System.out.printf("O salário com aumento: "+"%.2f", num);

    }
    
}
