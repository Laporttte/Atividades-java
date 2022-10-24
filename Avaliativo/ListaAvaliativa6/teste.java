package Avaliativo.ListaAvaliativa6;
import java.util.*;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("numero: ");
            num = sc.nextInt();
            sc.close();

        PrintContador(num);

    }
    public static void PrintContador(int num) {
        
      if (num>=1)   {
        // imprimo antes dos decrementos, logo, a ordenação fica > para < 3-2-1
        System.out.print("\nPilha: "+num);
        System.out.print("\n\n\n");

        PrintContador(num-1);

        System.out.print("\nSaida: "+num);
        // imprimo depois dos decrementos, logo, a ordenação fica > para > 1-2-3

      }
    }
}