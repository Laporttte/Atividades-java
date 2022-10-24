package Laboratorio.Lista1;
import java.util.*;
public class Atv3 {
    public static void main(String[] args)  {     
        Scanner sc = new Scanner(System.in);
        float convite, custo;

        System.out.print("Digite o custo total do teatro: ");
            custo = sc.nextFloat();
        System.out.print("Digite o valor do ingresso: ");
            convite = sc.nextFloat();
            sc.close();

            custo = custo/convite;

        System.out.print("Para atingir o valor do custo, devem ser vendidos: " + custo + " ingressos.");   
    }
}
   //Receba o valor do teatro, o preço do convite e calcule a quant. de convites para que o custo seja alcançado.