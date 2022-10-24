package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,x=0;
        System.out.print("Número entre 100 e 999: ");
            num = sc.nextInt();
        if (num<100 || num>999){
            while (num<100 || num>999)    {
            System.out.print("Digite novamente: ");
                num = sc.nextInt();    
            }
        }
            sc.close();
        while (x<3) {
            System.out.print(" "+num%10);
            num = num/10;
            x++;
        }
    }
}
