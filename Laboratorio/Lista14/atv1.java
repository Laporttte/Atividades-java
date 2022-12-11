package Laboratorio.Lista14;
import java.util.*;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.print("A: ");
            a = sc.nextLine();
        System.out.print("B: ");
            b = sc.nextLine();
            sc.close();

        int tamOriginal = b.length();
        b = b.replace(a, "");
        int resultado = tamOriginal - b.length();
        System.out.print("Existe "+(resultado/a.length())+" ocorrencias");
    }
}
