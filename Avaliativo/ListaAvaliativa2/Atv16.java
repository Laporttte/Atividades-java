package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv16 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.print("Digite a 1ª nota: ");
            n1 = sc.nextDouble();
        System.out.print("Digite a 2ª nota: ");
            n2 = sc.nextDouble();
            sc.close();
        if ((n1 >= 0.0 && n1 <=10.0) && (n2 >= 0.0 && n2 <=10.0) )  {
            System.out.print("Média: "+(n1+n2)/2);
        } else {
            System.out.print("Uma das notas não é válida.");
        }
    }
}
