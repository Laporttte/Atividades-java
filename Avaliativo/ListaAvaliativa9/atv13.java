package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word;
        word = sc.nextLine();
        char [] word2 = word.toCharArray();
        char [] word3 = word2;
        for (int i = 0; i < word2.length; i++) {
            if(word2[i]!=' ') {
                word3[i] = word2[i];
            }
        }
        sc.close();
        for (int i = 0; i < word3.length; i++) {
            System.out.print(word3[i]);
        }
    }
}
