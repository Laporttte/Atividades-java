package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv7 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double graus, rad;

        System.out.print("Ângulo em graus: ");
            graus = sc.nextDouble();
            sc.close();
        rad = graus * (3.14/180);

        System.out.printf("Ângulo em radianos: "+"%.3f", rad);

    }
    
}
