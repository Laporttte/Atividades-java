package Exemplos;
import java.util.*;
public class Ex_if_while{
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        String opcao;
        double desconto, parcelado, comissao, preco;

        System.out.print("\tDigite o valor do produto: ");
            preco = sc.nextDouble();

                desconto = preco - (preco*10/100);
                parcelado = preco/3;
                comissao = preco * 0.05;

        System.out.print("Deseja parcelar a compra?\n(à vista ou pix é 10% OFF)");
            opcao = sc.nextLine();  
            while (!opcao.equals("sim") && !opcao.equals("nao"))    {
                System.out.print("\nDigite apenas 'sim' ou 'nao': ");
                    opcao = sc.nextLine();
            }
                sc.close();
            if (opcao.equals("sim")) {
                System.out.printf("\nO valor parcelado fica: R$"+ "%.3f", parcelado);
            } else {
                System.out.println("\nO valor à vista fica: R$"+desconto);
            }
        System.out.print("\nA comissão do vendedor nessa produto é: "+comissao);
    }

}