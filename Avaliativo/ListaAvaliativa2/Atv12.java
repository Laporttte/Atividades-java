package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv12 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float econ, L, km;

        System.out.print("Digite a distância: ");
            km = sc.nextFloat();
        System.out.print("Digite os litros gastos: ");
            L = sc.nextFloat();
            sc.close();
            econ = km/L;

        if (econ <8) {
            System.out.print("Venda o carro!");
        } else if (econ >= 8 && econ <=14)  {
            System.out.print("Econômico!");
        } else {
            System.out.print("Super econômico");
        }
    }
}
