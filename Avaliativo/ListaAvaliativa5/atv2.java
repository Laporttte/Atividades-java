package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempC;

        System.out.print("Temperatura em Celsius: ");
            tempC = sc.nextDouble();
            sc.close();
        
        System.out.print("Temperatura em Fahrenheit = "+conversorTemp(tempC));
        
    }
    public static double conversorTemp (double tempC) {
        double F;

        F=(tempC*(9.0/5.0))+32.0;

        return F ;
    }
}
