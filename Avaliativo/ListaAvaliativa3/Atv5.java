package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        for (int x=0; x<10; x++)    {
            System.out.println("Digite o "+(x+1)+"º numero: ");
            num+= sc.nextInt();
        }
        sc.close();
        System.out.print(num);
    }
}
