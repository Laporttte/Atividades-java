package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv10 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a, b, c, opcao;
        double geo, pond, harm, arit;
        
        System.out.print("1º número: ");
            a = sc.nextInt();
        System.out.print("2º número: ");
            b = sc.nextInt();
        System.out.print("3º número: ");
            c = sc.nextInt();
        System.out.print("1 - Media geometrica\n2 - Media ponderada");
        System.out.print("\n3 - Media harmônica\n4 - Media aritmética\nEscolha:");
            opcao = sc.nextInt();
            sc.close();

        switch (opcao) {
            case 1:
                geo = Math.cbrt(a*b*c);
                System.out.print("A média é:"+geo);
                break;
            case 2:
                pond = (a+(2*b)+(3*c))/6;
                System.out.print("A média é:"+pond);
                break;
            case 3:
                harm = 1/((1/a)+(1/b)+(1/c));
                System.out.print("A média é:"+harm);
                break;            
            case 4:
                arit = (a+b+c)/3;
                System.out.print("A média é:"+arit);
                break;
            default: 
                System.out.print("Opção inválida.");
                break;
        }
    }
}
