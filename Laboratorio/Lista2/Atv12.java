package Laboratorio.Lista2;
import java.util.*;
public class Atv12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            int id;
            float n1,n2,n3, media, mediaAp;
            String result ="reprovado";
            
            System.out.print("Escreva o id do aluno: ");
                id = sc.nextInt();
            System.out.print("Escreva o valor da prova 1: ");
                n1 = sc.nextInt();
            System.out.print("Escreva o valor da prova 2: ");
                n2 = sc.nextInt();
            System.out.print("Escreva o valor da prova 3: ");
                n3 = sc.nextInt();
                sc.close();

            media = (n1+n2+n3)/3;
            mediaAp = (n1+(n2*2)+(n3*3)+media)/7;

            if (mediaAp >=60)   {
                result="aprovado";
            }

                System.out.print("\nO aluno "+id+" foi "+result+".\nSuas notas foram: "+n1+" - "+n2+" - "+n3);
                System.out.print("\nSua média foi: "+ media + " e a média de aproveitamento foi: ");

            if (mediaAp>=90)    {
                System.out.print(" >= 90 pontos. \nNota final = A.\n");
            } else if (mediaAp>=75 && mediaAp<90)   {
                System.out.print(" >= 75 e <90 pontos. \nNota final = B.\n");
            } else if (mediaAp>=60 && mediaAp<75)   {
                System.out.print(" >= 60 e <75 pontos. \nNota final = C.\n");
            } else if (mediaAp>=40 && mediaAp<60)   {
                System.out.print(" >= 40 e <60 pontos. \nNota final = D.\n");
            } else {
                System.out.print(" <40 pontos. \nNota final = E.\n");
                }
        }
    }
