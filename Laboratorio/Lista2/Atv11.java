package Laboratorio.Lista2;
import java.util.*;
public class Atv11 {

public static void main (String[] args) {         
    Scanner sc = new Scanner(System.in);
    int cod;
    float valor;

    System.out.print("\n\tCódigo Condição de pagamento\n\n"+
    "\t1 - À vista em dinheiro ou cheque, recebe 10% de desconto\n" +
    "\t2 - À vista no cartão de crédito, recebe 15% de desconto\n"+
    "\t3 - Em duas vezes, preço normal de etiqueta sem juros\n"+
    "\t4 - Em duas vezes, preço normal de etiqueta mais juros de 10%"+
    "\t--------------------------------------------------------\n\n");

    System.out.print("Digite o código de pagamento: ");
        cod = sc.nextInt();
    System.out.print("Digite o preço do produto: ");
        valor = sc.nextFloat();
        sc.close();

    if (cod == 1)    {
        valor = valor - (valor/10);
        System.out.print("\nO valor a ser pago é: "+valor);
    } else if (cod == 2)    {
        valor = valor -(valor/15);
        System.out.print("\nO valor a ser pago é: "+valor);
    } else if (cod == 3)    {
        System.out.print("\nO valor a ser pago é: "+valor+".\nA duas parcelas de: R$"+valor/2+" sem juros.");

    } else if (cod == 4)    {
        valor = valor + (valor/10);
        System.out.print("\nO valor a ser pago é: "+valor+".\nA duas parcelas de: R$"+valor/2+" com juros.");
    } else {
        System.out.println("\nO código digitado é inválido.");
    }
    }
}