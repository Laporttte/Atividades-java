package Laboratorio.Lista7;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saque, cont=0, contagem, notas[] = {100,50,20,10,5,2,1};

        /*2. Escreva um programa que receba como entrada o valor 
        do saque realizado pelo cliente de um banco e retorne
        quantas notas de cada valor serao necessarias para atender 
        ao saque com a menor quantidade de notas possível. 
        Serao utilizadas notas de 100, 50, 20, 10, 5, 2 e 1 real. */

        System.out.print("Digite o valor para ser sacado: ");
            saque = sc.nextInt();
            sc.close();

                while (saque>0) {
                    for (int i = 0; i < 7; i++) {
                        contagem = saque/notas[cont];
                            if (contagem!=0)    {
                            System.out.print("\nNota: "+ notas[cont]+" | quant: "+contagem);
                            }
                        contagem = contagem*notas[cont];
                        //System.out.print("\ncontagem2 "+ notas[cont]+"= "+contagem);
                        saque = saque - contagem;
                        //System.out.print("\nResto = "+saque);
                        
                            if(saque==0)    {
                                break;
                            }
                    cont++;
                    }
                }
        }
    }
    
