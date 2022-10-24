package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int soma, n1, n2, n3;

        System.out.print("1º número ");
            n1 = sc.nextInt();
        System.out.print("2º número ");
            n2 = sc.nextInt();
        System.out.print("3º número ");
            n3 = sc.nextInt();
            sc.close();
            soma = n1+n2+n3;

        System.out.println("Soma = " +soma);

    }
    
}
