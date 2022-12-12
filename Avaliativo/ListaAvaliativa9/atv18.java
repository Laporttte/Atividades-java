package Avaliativo.ListaAvaliativa9;
import java.util.*;;
public class atv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word, l1, l2;
        System.out.println("Digite a frase: ");
            word = sc.nextLine();
            System.out.println("Digite l1: ");
            l1 = sc.nextLine();
            System.out.println("Digite l2: ");
            l2 = sc.nextLine();

        word = word.replace(l1, l2);
        sc.close();
        System.out.println(word);
    }
}
