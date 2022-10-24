package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;
        char tipo;

        System.out.print("Numero 1 = ");
            n1 = sc.nextFloat();
        System.out.print("Numero 2 = ");
            n2 = sc.nextFloat();
        System.out.print("Simbolo ( + - / * )= ");
            tipo = sc.next().charAt(0);         
            sc.close();
            
        System.out.print("Resultado = "+calculadora(n1, n2, tipo));

    }

    public static float calculadora(float n1, float n2, char tipo) {
        float calculo=0;

        if (tipo=='+')   {
            calculo = n1+n2;
        }   else if (tipo=='-') {
            calculo = n1-n2;
        }   else if (tipo=='/') {
            calculo = n1/n2;
        }   else if (tipo=='*') {
            calculo = n1*n2;
        }
        return calculo;
    }
    
}