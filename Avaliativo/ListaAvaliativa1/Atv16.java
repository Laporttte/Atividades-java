package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv16 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Double ap1, ap2, ap3, premio, vt, v1, v2,v3;
    System.out.print("Valor do premio: ");
        premio = sc.nextDouble();
    System.out.print("1º aposta: ");
        ap1 = sc.nextDouble();
    System.out.print("2º aposta: ");
        ap2 = sc.nextDouble();
    System.out.print("3º aposta: ");
        ap3 = sc.nextDouble();
        sc.close();
        vt = ap1+ap2+ap3;
        ap1 = ap1/vt;
        v1 = premio*ap1;
        ap2 = ap2/vt;
        v2 = premio*ap2;
        ap3 = ap3/vt;
        v3 = premio*ap3;

    System.out.print("\nResultado: ");
    System.out.printf("\n1º apostador: "+"%.3f", v1);
    System.out.printf("\n2º apostador: "+"%.3f", v2);
    System.out.printf("\n3º apostador: "+"%.3f", v3);
    }
    
}
