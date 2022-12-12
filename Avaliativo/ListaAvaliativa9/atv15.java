package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frasemin, frasemaiu;

        System.out.print("Digite a frase minuscula: ");
            frasemin = sc.nextLine();

        frasemaiu = frasemin.toUpperCase();
        System.out.println(frasemaiu);
        sc.close();
    }
}
