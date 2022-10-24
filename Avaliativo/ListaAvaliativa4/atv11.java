package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R, r1=1, r2=1;
        while(r1!=0 && r2!=0) {
            System.out.print("Digite valor de r1: ");
            r1 = sc.nextInt();
            System.out.print("Digite valor de r2: ");
            r2 = sc.nextInt();
            R = ((r1*r2)/(r1+r2));
            System.out.print("Valor: "+R+"\n\n");
        }
        sc.close();
    }
}
