package Laboratorio.Lista6;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num_hab, valor_kwh, cod, cons, consMaior=0, consMenor=0, consMedio=0, consC1=0, consC2=0, consC3=0;

        System.out.print("\nNumero de habitantes: ");
            num_hab = sc.nextDouble();
        System.out.print("Valor do kwh: ");
            valor_kwh = sc.nextDouble();
            System.out.print("\n");

        for (int i=1; i<=num_hab; i++)   {
            System.out.print("Consumo mensal: ");
                cons = sc.nextDouble();
                    if (i==1)    {  // confere se é a primeira vez, se for, adiciona como base no menor e maior consumo;
                        consMaior=cons; consMenor=cons;
                    } else { // se não for a 1vez, vai comparar e armazenar os maiores.
                        if (cons>consMaior) {
                            consMaior = cons;
                        }
                        else if (cons<consMenor) {
                            consMenor = cons;
                        }
                    }
                    consMedio += cons; //armazena todo consumo p depois fazer a media
            System.out.print("Cod (1-2-3): ");
                cod = sc.nextDouble();
                    if (cod==1) { //é residencial
                        consC1+=cons;
                    }
                    else if (cod==2) { //é comercial
                        consC2+=cons;
                    }
                    else if (cod==3) { //é industrial
                        consC3+=cons;
                    }
        }
        sc.close();
        System.out.print("\n\nA média de consumo foi: "+consMedio/num_hab);
        System.out.print("\nO maior consumo foi: "+consMaior);
        System.out.print("\nO menor consumo foi: "+consMenor);
        System.out.print("\nO total consumo em kw/h é: "+consMenor*valor_kwh);
        System.out.print("\nO total de consumo residencial foi: "+consC1);
        System.out.print("\nO total de consumo comercial foi: "+consC2);
        System.out.print("\nO total de consumo industrial foi: "+consC3);
    }
}
