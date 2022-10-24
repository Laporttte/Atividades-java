package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv17 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float comp, larg, preco, custo, tam;

        System.out.print("Comprimento do terreno: ");
            comp = sc.nextFloat();
        System.out.print("Largura do terreno: ");
            larg = sc.nextFloat();
        System.out.print("Preço da tela: ");
            preco = sc.nextFloat();
            sc.close();
            tam = 2*(comp+larg);
            custo = tam*preco;

        System.out.print("O preço para cercar o terreno é: "+custo);

    }
    
}
