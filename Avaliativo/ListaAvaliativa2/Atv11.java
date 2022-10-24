package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv11 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            sc.close();
            
        if (idade>4)   {
            if (idade >= 5 && idade <= 7)   {
                System.out.print("Infantil A");
            } else if (idade >= 8 && idade <= 10)   {
                System.out.print("Infantil B");
            } else if (idade >= 11 && idade <= 13)  {
                System.out.print("Juvenil A");
            } else if (idade >= 14 && idade <= 17)  {
                System.out.print("Juvenil B");
            } else {
                System.out.print("Sênior");
            }
        } else {
            System.out.print("Idade inválida para as categorias existentes.");
        }
    }
}
