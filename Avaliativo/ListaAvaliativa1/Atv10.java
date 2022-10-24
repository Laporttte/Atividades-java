package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv10 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Double hV, hT, salario;

        System.out.print("Valor da hora em reais: ");
            hV = sc.nextDouble();
        System.out.print("Quantidade de horas trabalhadas: ");
            hT = sc.nextDouble();
            sc.close();
            salario = hV*hT + ((hV*hT)*0.10);

        System.out.print("O salário + 10%: "+ salario);

    }
    
}
