package Avaliativo.ListaAvaliativa3;
import java.util.*;
public class Atv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntNum, num, maior, qntMaior=0, x=1;
        System.out.print("Digite a quant. de entradas: ");
            qntNum = sc.nextInt();
        System.out.print("Digite: "); //primeira verificacao, pra armazenar no maior
            num = sc.nextInt();
            maior = num;
            qntMaior++;
        do {
            System.out.print("Digite: ");
                num = sc.nextInt();
            if (num==maior) {   //verifica se sao iguais p adicionar na conta
                qntMaior++;
            } else if (num>maior)  {
                maior = num;
                qntMaior=0; //caso um numero seja > q o "maior", tem q zerar pra recontar;
                qntMaior++;
            } 
            x++;
        } while (x<qntNum);
        sc.close();
        System.out.print("Maior: "+maior+" e foi digitado "+qntMaior+" "+
         "vezes");
    }
}
