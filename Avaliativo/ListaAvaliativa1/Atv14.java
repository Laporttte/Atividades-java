package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv14 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int s, h, m;

        System.out.print("Escreva os segundos: ");
            s = sc.nextInt();
            sc.close();
            h = s/3600;
            m = s/60;
        System.out.print("São "+h+" horas. \nOu "+m+" minutos. \nOu "+s+ " segundos.");

    }
    
}
