package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nM=0, nm=0, num;

        for (int x=0; x<9; x++)    {
            System.out.print("Digite: ");
                num = sc.nextInt();
            if (num==0) {
                nM = num; nm = num;
            } if (num>nM) {
                nM = num;
            } if (num<nm)  {
                nm = num;
            }
        }
        sc.close();
        System.out.println("\nMaior: "+nM+"\nMenor: "+nm);
    }
}
