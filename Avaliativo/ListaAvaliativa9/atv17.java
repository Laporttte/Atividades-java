package Avaliativo.ListaAvaliativa9;
import java.util.*;;
public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word;
        System.out.println("Digite a frase: ");
            word = sc.nextLine();

        word = word.replace(" ", "");
        sc.close();
        System.out.println(word);
    }
}
