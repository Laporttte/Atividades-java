package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frasemin, frasemaiu;

        System.out.print("Digite a frase maiuscula: ");
        frasemaiu = sc.nextLine();

        frasemin = frasemaiu.toLowerCase();
        System.out.println(frasemin);
        sc.close();
    }
}
