package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase1, frase2;
    
        System.out.println("frase 1: ");
        frase1 = sc.nextLine();
        System.out.println("frase 2: ");
        frase2 = sc.nextLine();
            sc.close();

        comparaString(frase1, frase2);

    }
    public static void comparaString(String frase1, String frase2)  {
        if (frase1.equals(frase2))   {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são iguais!");
        }
    }
}
