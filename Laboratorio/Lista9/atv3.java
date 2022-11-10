package Laboratorio.Lista9;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int limite;
        limite = sc.nextInt();

        System.out.println(calc(limite)); 
        sc.close();
    }
    public static int calc(int limite)  {

        if (limite>0)    {
            return (1+limite*limite)/limite+ calc(limite-1);
        } else {
            return 0;
        }
    }
}
