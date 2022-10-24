package Avaliativo.ListaAvaliativa5;
import java.util.*;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        char tipo;

        System.out.print("Nota 1 = ");
            n1 = sc.nextFloat();
        System.out.print("Nota 2 = ");
            n2 = sc.nextFloat();
        System.out.print("Nota 3 = ");
            n3 = sc.nextFloat();

        System.out.print("(A)ritmetica ou (P)onderada: ");
            tipo = sc.next().charAt(0);
            sc.close();
            
        media(n1, n2, n3, tipo);

    }

    public static void media(float n1, float n2, float n3, char tipo) {
        float md;

        if (tipo=='A'||tipo=='a')   {
            md = (n1+n2+n3)/3;
            System.out.print("Aritmetica: "+md);
        }   else {
            md = ((n1*5)+(n2*3)+(n3*2))/10;
            System.out.print("Ponderada: "+md);
        }

    }
    
}
