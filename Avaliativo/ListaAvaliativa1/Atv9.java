package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv9 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int dias;
        double salBruto, salLiquido;

        System.out.print("Dias trabalhados: ");
            dias = sc.nextInt();
            sc.close();
            salBruto = dias*30;
            salLiquido = salBruto - (salBruto*0.08);

        System.out.print("O salário liquido é: " + salLiquido);
    }
    
}
