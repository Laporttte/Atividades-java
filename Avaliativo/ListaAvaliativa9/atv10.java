package Avaliativo.ListaAvaliativa9;
import java.util.*;;
public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;

        word = sc.nextLine();
            sc.close();

        char [] wordReverse = word.toCharArray();

        for (int i = wordReverse.length-1; i >= 0; i--) {
            System.out.print(wordReverse[i]);
        }
    }
}
