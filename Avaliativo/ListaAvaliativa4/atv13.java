package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float idade, qnt=0, soma=0;
        boolean op=true;
        while(op) {
            System.out.println("Idade: ");
                idade = sc.nextFloat();
            if (idade > 0) {
                soma += idade;
                qnt++;
            } else {
                op = false;
            }
        }
        sc.close();
        System.out.print("Média das idades: "+(soma/qnt));
    }
}
