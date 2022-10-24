package Laboratorio.Lista7;
import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=-1;

        while (num<0)   {
            System.out.print("Número: ");
                num = sc.nextInt();
        }
                sc.close();
            System.out.print("Resultado: ");
            primo(num);
    }
    public static void primo(int num) {
        boolean pr = true;
        for (int i = 1; i <= num &&pr==true; i++) {
            if (i!=1 & i!=num)  {
                if (num%i==0)   {
                    pr=false;
                }
            }
        }
        if (pr==false)  {
            System.out.print("Não é!");
        } else {
            System.out.print("Sim, é!");
        }
        
    }
}
