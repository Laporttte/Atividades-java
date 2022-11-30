
package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase;
        int cont=0;

        frase = sc.nextLine();
            sc.close();

        for(int i=0; i<frase.length(); i++) {
            char [] charFrase = frase.toCharArray();
            if (charFrase[i]=='1')  {
                cont++;
            }
        }
        System.out.println("Qnt de 1: "+cont);

    }
}
