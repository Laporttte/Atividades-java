package Laboratorio.Lista4;
import java.util.*;
public class Atv4 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num, z_v=0, v_c=0, c_s=0, s_c=0;
        do {
            System.out.print("Numeros: ");
                num = sc.nextInt();
            if (num>-1 && num<26)    {
                z_v++;
            } else if (num>25 && num<51)    {
                v_c++;
            } else if (num>50 && num<76)    {
                c_s++;
            } else if (num>75 && num<101)    {
                s_c++;
            }
        } while (num>-1);
            sc.close();
        System.out.print("\nEntre 0 a 25: "+z_v);
        System.out.print("\nEntre 26 a 50: "+v_c);
        System.out.print("\nEntre 51 a 75: "+c_s);
        System.out.print("\nEntre 76 a 100: "+s_c);
    }
}
