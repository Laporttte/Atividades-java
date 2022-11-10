package Laboratorio.Lista9;
 import java.util.*;
 public class atv1{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int i, k, j;

         System.out.print("Inicio: ");
         i = sc.nextInt();
         System.out.print("Fim: ");
         j = sc.nextInt();
         System.out.print("Intervalo: ");
         k = sc.nextInt();
         sc.close();

         System.out.println("Resultado: "+soma(i, j, k));
         
     }
     public static int soma(int i, int j, int k){
         if(i>=j){
             return 0;
         }
         return i+soma(i+k, j,k);
     }
 }