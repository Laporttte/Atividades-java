package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Digite a: ");
            a = sc.nextDouble();
        System.out.print("Digite b: ");
            b = sc.nextDouble();
            sc.close();

        System.out.print("Hipotenusa = "+hipotenusa(a,b));

    }
    public static double hipotenusa(double a, double b) {
        double resultado;

        resultado = Math.sqrt((a*a)+(b*b));

        return resultado;
    }
    
}
