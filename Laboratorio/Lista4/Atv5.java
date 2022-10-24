package Laboratorio.Lista4;
import java.util.*;
public class Atv5 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float pos=1;
        
        System.out.print("Digite um numero negativo para encerrar.\n");
        while (pos>0)   {
            System.out.print("Número: ");
                pos = sc.nextFloat();
        }
            sc.close();
    }
}
