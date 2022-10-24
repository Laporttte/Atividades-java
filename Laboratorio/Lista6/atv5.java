package Laboratorio.Lista6;
import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, maior=1;
            //System.out.print("Digite um numero de 6 digitos: ");
            //num = sc.nextInt();
        
        for(int i=100;i<999;i++)  {
            for(int j=100;j<999;j++)  {
                num = i*j;
                if (verifica(num)==3) { // se for polindromo
                    if (num>maior) { // se o novo polindromo é maior que o anterior
                        maior = num;
                    }
                }
            }
        }
        System.out.println(maior);
        sc.close();
    }

    public static int verifica(int num) {
        int confirma=0, primeiro, segundo, terceiro, quarto, quinto, sexto;

        primeiro = num/100000;
        segundo = num/10000%10;
        terceiro = num/1000%10;
        quarto = num/100%10;
        quinto =  (num%100*100)/1000;
        sexto = num%10;
        
        if (primeiro==sexto) { //salva o primeiro e ultimo valor - xyyyyx 
            //System.out.println("São iguais: "+(num/100000)+" "+(num%10));
            confirma++;
        }
        if (segundo==quinto) {//salva o segundo e penultimo valor - yxyyxy 
            //System.out.println("São iguais: "+(num/10000%10)+" "+((num%100*100)/1000));
            confirma++;
        }
        if (terceiro==quarto) { //salva o terceiro e o antepenultimo valor - yyxxyy
            //System.out.println("São iguais: "+(num/1000%10)+" "+(num/100%10));
            confirma++;
        } 
            return confirma;  
    }
}
