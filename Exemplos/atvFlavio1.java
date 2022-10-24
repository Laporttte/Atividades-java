package Exemplos;
import java.util.*;

public class atvFlavio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3;
        char op;

        System.out.print("Escolha a opção: ");
            op = sc.next().charAt(0);

        System.out.print("Nota 1: ");
            nota1 = sc.nextFloat();
        System.out.print("Nota 1: ");
            nota2 = sc.nextFloat();
        System.out.print("Nota 1: ");
            nota3 = sc.nextFloat();
            sc.close();

        System.out.print(" "+media(nota1, nota2, nota3, op));
    }
    public static float media(float nota1, float nota2, float nota3, char op)    {
        float res;

        if (op=='P') {
            res = ((nota1*5)+(nota2*3)+(nota3*2))/3;
        } else {
            res = (nota1+nota2+nota3);
        }
        return res;
    }
 
}
