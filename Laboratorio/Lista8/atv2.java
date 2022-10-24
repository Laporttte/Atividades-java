package Laboratorio.Lista8;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Numero x: ");
            x=sc.nextInt();
        System.out.print("Numero y: ");
            y=sc.nextInt();
            sc.close();
        
        System.out.print(x+"^"+y+" = "+potencia(x, y));
    }
    static int potencia (int x, int y)  {
        int pot=1;
        for(int i=1; i<=y; i++) {
            pot*=x;
        }
        return pot;
    }
}
