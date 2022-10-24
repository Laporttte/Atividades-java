package Laboratorio.Lista3;
import java.util.*;
public class Atv2 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int num;
        double log;
         
        System.out.print("Digite um número: ");
            num = sc.nextInt();
            sc.close();
        if(num<=0)  {
            System.out.print("Número inválido.");
        } else {
            log = Math.log10(num);
            System.out.print("O log de num é:"+log);
        }
    }
}
