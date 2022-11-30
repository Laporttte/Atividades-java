package Avaliativo.ListaAvaliativa9;
import java.util.*;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        
        nome = sc.nextLine();
            sc.close();
        char [] char4 = new char[4];

        nome.getChars(0,4,char4,0);

        for (int i = 0; i < char4.length; i++) {
            System.out.print(char4[i]);
        }

    }
}
