package Avaliativo.ListaAvaliativa6;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("N = ");
            N = sc.nextInt();
            sc.close();

        System.out.print("Fatorial = "+fat(N));
    }
    public static int fat (int N)   {
        if (N==1) {
            return 1; //se eu retorno 1, é o numero, se aumento o retorno ele me dá 2x, 3x, 4x...
        }   //esse return que determina o que?
        return N*fat(N-1);
    }
}
