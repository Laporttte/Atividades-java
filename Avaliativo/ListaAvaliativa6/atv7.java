package Avaliativo.ListaAvaliativa6;
import java.util.*;
public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("numero: ");
            num = sc.nextInt();
            sc.close();
            if (num>=0) {
              PrintContador(num);
          }
    }
    public static void PrintContador(int num) {
        
      if (num>=0)   {

        PrintContador(num-1);
        System.out.print(" "+num);

      }
    }
}
//https://pt.stackoverflow.com/questions/38475/recursividade-para-retornar-n%C3%BAmeros-de-0-at%C3%A9-n
//https://wagnergaspar.com/funcoes-e-procedimentos-recursivos-com-a-linguagem-c/