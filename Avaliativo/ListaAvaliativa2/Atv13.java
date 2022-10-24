package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv13 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float trab, aval, exam, pond;

        System.out.print("Nota do trabalho: ");
            trab = sc.nextFloat();
        System.out.print("Nota da avaliação: ");
            aval = sc.nextFloat();
        System.out.print("Nota do exame final: ");
            exam = sc.nextFloat();
            sc.close();
            pond = ((trab*2)+(aval*3)+(exam*5))/(2+3+5);

        if (pond <=2.9)  {
            System.out.print("Reprovado.");
        } else if (pond > 3 && pond <=4.9)  {
            System.out.print("Em recuperação.");
        } else {
            System.out.print("Aprovado.");
        }
       }
}
