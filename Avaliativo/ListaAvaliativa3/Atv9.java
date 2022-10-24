package Avaliativo.ListaAvaliativa3;

import java.util.*;

public class Atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x = 0, y = 0;
        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();
        sc.close();
        while (x < N) {
            if (y % 2 != 0) {
                System.out.print(" - " + y);
                x++;
            }
            y++;
        }
    }
}
