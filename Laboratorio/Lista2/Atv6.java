package Laboratorio.Lista2;
import java.util.*;
public class Atv6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primeiro, segundo;

        System.out.print("Digite o 1º valor boolean: ");
            primeiro = sc.nextBoolean();
        System.out.print("Digite o 2º valor boolean: ");
            segundo = sc.nextBoolean();
            sc.close();
        
        if ((segundo == primeiro) && primeiro == true)    {
            System.out.print("Os valores são ambos verdadeiros.");
        } else if ((segundo == primeiro) && primeiro == false){
            System.out.print("Os valores são ambos falsos.");
        } else {
            System.out.print("Os valores não são iguais.");
        }
    }
}