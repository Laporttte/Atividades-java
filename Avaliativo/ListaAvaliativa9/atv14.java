package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word;
        word = sc.nextLine();
        int qnt =0;
        char [] word2 = word.toCharArray();

        for (int i = 0; i < word2.length; i++) {
            if(word2[i]==' ') {
                qnt++;
            }
        }
        sc.close();
        System.out.println("qnt="+qnt);
    }
}
