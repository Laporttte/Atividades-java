package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1, l2, l3;

        System.out.print("lado 1: ");
            l1 = sc.nextInt();
        System.out.print("lado 2: ");
            l2 = sc.nextInt();
        System.out.print("lado 3: ");
            l3 = sc.nextInt();
            sc.close();

        if (l1>0 && l2>0 && l3>0)   {

            if(isaTriangle(l1, l2, l3)==true) {
                if((typeofTriangle(l1, l2, l3)==0))  {
                    System.out.print("Equilatéro");
                } else if((typeofTriangle(l1, l2, l3)==1))  {
                    System.out.print("Escaleno");
                } else {
                    System.out.print("Isóceles");
                }
            } else {
                System.out.print("Não é um triangulo.");
            }
            
        }
    }
    public static boolean isaTriangle (int l1, int l2, int l3)  {

        if (l1+l2>l3 && l1+l3>l2 && l2+l3>l1)   {
            return true;
        } else {
            return false;
        }
    }
    public static int typeofTriangle (int l1, int l2, int l3)  {
        if (l1==l2 && l1==l3) {
            return 0;
        }
        else if (l1!=l2 && l1!=l3 && l3!=l2) {
            return 1;
        } else {
            return 2;
        }
    }
   
}
