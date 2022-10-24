package Laboratorio.Lista2;
import java.util.*;
public class Atv2 {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       String nome, estado, sexo;
       float idadeCasamento = 0;

        System.out.println("Qual seu nome? ");
            nome = sc.nextLine();
        System.out.println("Qual seu sexo? (F ou M) ");
            sexo = sc.nextLine();
            sexo = sexo.toUpperCase(); //Transforma p caixa alta. FeMinino > FEMININO
                                                    //(.toLowerCase faz inverso)
            sexo = sexo.replace("FEMININO","F");    //troca letras e palavras. FEMININO > F

        System.out.println("Qual seu estado civil? (casado(a)/solteiro(a) ");
            estado = sc.nextLine();
            estado = estado.toUpperCase(); //Transforma p caixa alta. casado > CASADO

            if (sexo.equals("F")){  //Se sexo é igual a F, vai trocar CASADO por CASADA
            estado = estado.replace("CASADO","CASADA");
            }

            if (sexo.equals("F") && estado.equals("CASADA"))   {
            System.out.print("Quantos anos você está casada? ");
               idadeCasamento = sc.nextFloat();
            }
            sc.close();
            System.out.print("\nNome: "+nome+"\nSexo: "+sexo+"\nEstado: "+estado+"\nTempo de casado(a): "+idadeCasamento);
        }
    }
