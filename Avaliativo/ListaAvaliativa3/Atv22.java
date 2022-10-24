package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota=10, med=0, qnt=0;
        while (nota>=10 && nota<=20)    {
            System.out.print("Nota: ");
                nota = sc.nextInt();
                if (nota>=10 && nota<=20)   { //necessario pra nao contar o numero de saida como nota e nem como quant.
                qnt++;
                med+=nota;
                }
        }
            sc.close();
        System.out.print("Média = "+med/qnt);
    }
    
}
