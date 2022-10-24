package Avaliativo.ListaAvaliativa6;
import java.util.*;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;

        System.out.print("Base = ");
            K = sc.nextInt();
        System.out.print("Expoente = ");
            N = sc.nextInt();
            sc.close();

        System.out.print("Potência = "+potenciação(N, K));
    }
    public static int potenciação(int N, int K) {
        if (N==0) {
            return 1;
        }
        return K*potenciação(N-1, K);
    }
}