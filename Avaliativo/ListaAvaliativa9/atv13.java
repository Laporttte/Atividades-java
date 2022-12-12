package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word;
        int cont=0;
        System.out.println("Digite a frase: ");
            word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==' ') {
                cont++;
            }
        }
        sc.close();
        System.out.println("Tem "+cont+" espaços em branco.");
    }
}
