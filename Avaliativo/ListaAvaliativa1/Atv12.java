package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv12 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Número inteiro de 3 digitos: ");
            num = sc.nextInt();
            sc.close();

            String str = String.valueOf(num);

            System.out.print("Invertido: ");          
            System.out.print(str.charAt(2));
            System.out.print(str.charAt(1));
            System.out.print(str.charAt(0));
            
    }
    
}
