package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Numero: ");
            num = sc.nextInt();
            sc.close();
        
        if (num>0) {
            System.out.print("Soma: "+somaAlgarismo(num));
        }
        else {
            System.out.println("numero invalido");
        }
    }
    public static int somaAlgarismo (int num)   {
        int soma=0;

        while (num!=0)  {
            soma += num%10;
            num = num/10;
        }

        return soma;
    }
}
