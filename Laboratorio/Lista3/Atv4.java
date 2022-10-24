package Laboratorio.Lista3;
import java.util.*;
public class Atv4 { 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String opcao;
        float num1, num2;

        System.out.print("\n\tTabela calculavel");
        System.out.print("\n(a) = Soma de 2 numeros\n(b) = Diferença entre 2 numeros (maior pelo menor)\n(c) = Produto entre 2 numeros\n(d) = Divisão entre 2 numeros (denominador não pode ser zero)\n");
        System.out.print("Escreva a opção: ");    
            opcao = sc.nextLine();

        System.out.print("\nEscreva o primeiro número: ");
            num1 = sc.nextFloat();
        System.out.print("\nEscreva o segundo número: ");
            num2 = sc.nextFloat();
            sc.close();

        switch (opcao)  
        {
            case "a":
            System.out.print("\nSoma: "+(num1+num2));
                break;

            case "b":
            if (num1>num2)
            System.out.print("\nDiferença: "+(num1-num2));
            else 
            System.out.print("\nDiferença: "+(num2-num1));
                break;

            case "c":
            System.out.print("\nProduto: "+(num1*num2));
                break;

            case "d":
            if (num2==0)    {
                System.out.print("\nErro! O denominador é zero");
                break;
            }
            System.out.print("\nDivisão: "+(num1/num2));
                break;

            default:
            System.out.print("\n\nErro! Opção inválida.");
                break;
        }
    }
    
}
