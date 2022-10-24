package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, raio;

        System.out.print("Digite altura: ");
            h = sc.nextDouble();
        System.out.print("Digite raio: ");
            raio = sc.nextDouble();
            sc.close();

        System.out.println("Volume: "+volume(h, raio)); 
        
    }
    public static double volume(double h, double raio) {
        double resultado;

        resultado = 3.14 * (raio*raio) * h;

        return resultado;
    }
    
}
