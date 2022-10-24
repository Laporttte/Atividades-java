package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv15 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double salario, prest;

        System.out.print("Digite o salario: ");
            salario = sc.nextDouble();
        System.out.print("Digite o valor da prestação: ");
            prest = sc.nextDouble();
            sc.close();
        if (prest > (salario*0.2))  {
            System.out.print("Empréstimo não concedido.");
        } else {
            System.out.print("Empréstimo concedido.");
        }
    }
}
