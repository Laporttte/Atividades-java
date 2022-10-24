package Avaliativo.ListaAvaliativa6;
import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("n1 = ");
            n1 = sc.nextInt();
        System.out.print("n2 = ");
            n2 = sc.nextInt();
            sc.close();
        
        System.out.print("Multiplicação = "+Multip(n1, n2));
        //Multip(n1,n2);
    }    
    public static int Multip(int n1, int n2) {
        if (n2==0)  { //porque ficou 0 e nao 1? porque n2 é subtraido antes da conta?
            return 0;
        }        
        //System.out.print("\n\n2: n1="+n1+" - n2="+n2);
        return n1+Multip(n1, n2-1);
    }
}   
//se o n2 == 1, ele conta apenas 4 vezes quando n=5
// 5 - 4 - 3 - 2 => quando é 1, entra no if e não faz a conta.