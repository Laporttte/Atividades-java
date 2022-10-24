package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite o numero para o desenho: ");
            num = sc.nextInt();
            sc.close();

        desenhaLinha(num);
    }
    public static void desenhaLinha(int num)    {
        for(int i=0;i<num; i++) {
            System.out.print("=");
        }
    }
}
