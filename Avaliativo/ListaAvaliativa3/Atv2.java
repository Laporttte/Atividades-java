package Avaliativo.ListaAvaliativa3;

public class Atv2 {
    public static void main(String[] args) {
        int b = 1, c = 1;
        for (int a = 1; a <= 100; a++) {
            System.out.print(" - " + a);
        }
        System.out.print("\n\n");
        while (b < 101) {
            System.out.print(" - " + b);
            b++;
        }
        System.out.print("\n\n");
        do {
            System.out.print(" - " + c);
            c++;
        } while (c <= 100);
    }
}
