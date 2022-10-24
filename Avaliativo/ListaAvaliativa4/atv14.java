package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, tempAnt=0, ant=1, suc=1;

        System.out.print("Digite o valor: ");
            num = sc.nextInt();
            sc.close();

        if (num==1)   {
            System.out.print("0 1");
        }   else if (num==2) {
            System.out.print("0 1 1");
        }   else   {
            num += -2;
            System.out.print("0 1");
            for (int i=0; suc<=num; i++)   {
                tempAnt = ant;
                ant = ant + suc;
                suc = tempAnt;
                System.out.print(" "+suc);
                System.out.println("\n\n\n'value is not used--"+i);//Aparecia o aviso "var is not used, acionei a o linha pra sumir com ele"
            }
        }
    }    
}
