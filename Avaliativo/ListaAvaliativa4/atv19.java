package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double carlos, joao, poup, rend;
        int cont=0;

        System.out.print("Salario de carlos: ");
            carlos = sc.nextDouble();
            joao = carlos/3;
            sc.close();
    
        while(joao<carlos) {
            cont++;

            poup=carlos*0.02;
            carlos+=poup;

            rend=joao*0.05;
            joao+=rend;
        }   
        System.out.println("Demorou "+(cont)+" meses.");
    }


}
