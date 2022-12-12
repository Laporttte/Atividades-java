package Laboratorio.Lista14;

import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] nomes = new String [5];
        String nome;
        char op;
        int contador=0;
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome: ");
                nomes[i] = sc.next();
                contador++;
            if (i!=nomes.length-1) {
            System.out.print("Deseja escrever mais um nome? (sim/nao)");
                op = sc.next().charAt(0);
                if(op!='s' && op!='S') {
                    i+=5;
                }
            }
        }
        System.out.println("Qual nome você quer pesquisar? ");
            nome = sc.next();
        for (int i = 0; i < contador; i++) {
            if(nomes[i].indexOf(nome)!=-1) {
                System.out.print(nomes[i]+" - indice: "+i);
            }
        }
        sc.close();
    }

}
