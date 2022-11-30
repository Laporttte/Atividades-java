package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class incompleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String cod = "3";
        boolean achou = false;

        frase = sc.nextLine();
            sc.close();
        System.out.println("Tam: "+frase.length());

        frase.concat(cod);

        while(achou==false) {
            int i=0;
            if(frase.charAt(i)=='3') {
                System.out.print("Tam: "+i);
                achou=true;
            }
        }

    }
}
