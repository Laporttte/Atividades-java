package Laboratorio.Lista6;
import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soma=0, qnt=0, maior=0, menor=0, somaPar=0, qntPar=0, num=1;

        while(num!=0)   {
        System.out.print("número: ");
            num = sc.nextFloat();
          if (num>0)  {
            soma+=num;
            qnt++;
                if (qnt==1) { //ajusta os valores do maior e menor
                    maior = num; menor = num;
                }
                if (maior<num)  {
                    maior = num;
                } else if (menor>num)  {
                    menor = num;
                }
                if (num%2==0)   {
                    somaPar+=num;
                    qntPar++;
                }
          }
        }
        sc.close();
        System.out.print("\nSoma: "+soma);
        System.out.print("\nQuant: "+(qnt));
        System.out.print("\nMédia: "+soma/(qnt));
        System.out.print("\nMaior: "+maior);
        System.out.print("\nMenor: "+menor);
        System.out.print("\nMédia Par: "+somaPar/qntPar);
    }
    
}
