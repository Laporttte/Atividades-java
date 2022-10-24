package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, qntPar=0, aux=0;
        while (num!=1000)  {
            System.out.print("Número: ");
                num = sc.nextInt();
            if (num%2==0)   {
                qntPar++;
            } else {
                aux++;
            }
        }
        sc.close();
        System.out.print("Numeros lidos: "+(qntPar+aux-1)+"\nPar: "+(qntPar-1));
    }
}
