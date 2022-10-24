package Laboratorio.Lista3;
import java.util.*;
public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, mediap;

        System.out.print("Nota 1: ");
            n1 = sc.nextFloat();
            n1 = n1*1;
        System.out.println("Nota 2: ");
            n2 = sc.nextFloat();
            n2 = n2*1;
        System.out.println("Nota 3: ");
            n3 = sc.nextFloat();
            n3 = n3*2;
            sc.close();

            mediap = (n1+n2+n3)/(1+1+2);
        
        if (mediap >= 60)   {
            System.out.print("O aluno foi aprovado, com a média de: "+mediap);
        } else {
            System.out.print("O aluno foi reprovado, com média de: "+mediap);
        }
    }
}
