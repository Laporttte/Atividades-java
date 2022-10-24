package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        float num, den;
        boolean saida =true;

        while (saida)   {
        System.out.print("1º numero: ");
            num = sc.nextFloat();
        System.out.print("2º numero: ");
            den = sc.nextFloat();
            
        System.out.print("\n\n(1) Adicão\n(2) Subtração\n(3) Multiplicação\n(4) Divisão\n(5) Saída");
        System.out.print("\nDigite a opção: ");
            op = sc.nextInt();

        switch (op)    {
            case 1:
            System.out.print("\nSoma: "+(num+den));
            break;
            case 2:
            System.out.print("\nSubtração: "+(num-den));
            break;
            case 3:
            System.out.print("\nMultiplicação: "+(num*den));
            break;
            case 4:
            System.out.print("\nDivisão: "+(num/den));
            break;
            case 5:
            saida = false;
            break;
            default:
            System.out.println("\nInválido");
            break;
        }
    }
    sc.close();

    }
    
}
