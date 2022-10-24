package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv20 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double val, parc, desc, vend, x=1;

        System.out.print("Valor do produto: ");
            val = sc.nextDouble();
            sc.close();

            desc = val - (val*0.10);
            parc = val/3;
            vend = val*0.05;

        System.out.print("\nO valor com desconto de 10%: "+desc);

        System.out.printf("\nParcelamento a 3x sem juros: " + val);
        while (x<4){
        System.out.printf("\n"+x+"º parcela: "+ "%.3f", parc );
        x++;
        }

        System.out.print("\nComissão do vendedor: "+ vend);

    }
    
}
