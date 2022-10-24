package Exemplos.vetores;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] notas = new double[4];
        double media=0;

        System.out.print("Digite as notas: \n");
        for(int i=0; i<=3; i++) {
            System.out.print("Nota "+(i+1)+": ");
                notas[i]=sc.nextInt();
                media+=notas[i];
        }
        for(int i=0;i<=3;i++)   {
            System.out.print("\nNota "+(i+1)+": "+notas[i]);
        }
        System.out.print("\nMedia ="+media/4);
        sc.close();

    }
}
