package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia, gasolina;

        System.out.print("Distancia: ");
            distancia = sc.nextDouble();
        System.out.print("Gasolina: ");
            gasolina = sc.nextDouble();
            sc.close();

        gasoConsumo(distancia, gasolina);
    }
    public static void gasoConsumo(double distancia, double gasolina) {
        double consumo = distancia/gasolina;
        
        if(consumo<8)   {
            System.out.print("Venda o carro!");
        } else if (consumo>12)  {
            System.out.print("Super econômico!");
        } else {
            System.out.println("Economico!");
        }

    }
    
}
