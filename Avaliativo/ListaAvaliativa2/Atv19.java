package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv19 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double costFab, costCons, comDist, taxas;

        System.out.print("Escreva o custo de fabrica: ");
            costFab = sc.nextDouble();
            sc.close();
            
        if (costFab > 12000 && costFab <=25000)   {
            comDist = costFab * 0.10;
            taxas = costFab * 0.15;
            costCons = costFab+taxas+comDist;
            System.out.print("O custo ao consumidor é: "+costCons);
        } else if (costFab <= 12000)   {
            comDist = costFab * 0.05;
            costCons = costFab+comDist;
            System.out.print("O custo ao consumidor é: "+costCons);
        } else {
            taxas = costFab * 0.20;
            comDist = costFab *0.15;
            costCons = costFab+taxas+comDist;
            System.out.print("O custo ao consumidor é: "+costCons);
        }
    }
}
