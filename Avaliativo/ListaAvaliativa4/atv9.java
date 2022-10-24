package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area, b=1, h=1;
        boolean op=true;

        while (op)    {
            System.out.println("Digite o valor da base: ");
            b = sc.nextFloat();
            System.out.println("Digite o valor da altura: ");
            h = sc.nextFloat();
            if (b>0 && h>0){
                op = false;
            }
        }
        sc.close();
        area = (b*h)/2;
        System.out.println("Area: "+area);
    }
}
