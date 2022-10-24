package Avaliativo.ListaAvaliativa6;
import java.util.*;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("numero: ");
            num = sc.nextInt();
            sc.close();
            if (num>=0 && num%2==0) {
                PrintContador(num);
            }
    }
    public static void PrintContador(int num) {
        
      if (num>=0)   {
        PrintContador(num-2);
        System.out.print(" "+num);
      }
    }
}