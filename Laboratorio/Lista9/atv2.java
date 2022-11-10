package Laboratorio.Lista9;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, k, j;
        System.out.print("Inicio: ");
        i = sc.nextInt();
        System.out.print("Fim: ");
        j = sc.nextInt();
        System.out.print("Intervalo: ");
        k = sc.nextInt();
        sc.close();

        imprime(i, j, k);
        
    }
    public static int imprime(int i, int j, int k){
        if(i>=j){
            return 0;
        }
        System.out.println("Valores da serie: "+i);
        return i+imprime(i+k, j,k);
    }
}
