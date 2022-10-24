package Exemplos;

import java.util.Scanner; //chamada para a leitura

class ExLeitura {       //Necessario o classheader para funcionar o java.
                    //"public class" necessita ter o mesmo nome do arquivo.
    public static void main(String[] args) {    //Criação da função main
        Scanner sc = new Scanner(System.in);  //Necessário para a leitura de dados
       int idade; //Declaração da var
       String name;

        System.out.println("qual sua idade?"); 
        idade = sc.nextInt();     //Cada var necessita uma chamada diferente
        System.out.println("Você tem " + idade + " anos.");
        
        System.out.println("E qual seu nome?");
        name = sc.next();
        System.out.println("Olá, " + name + ". Você tem " + idade + " anos."); 
        
        sc.close();
    }

}

/* 
float numF = sc.nextFloat();
int num1 = sc.nextInt();
byte byte1 = sc.nextByte();
long lg1 = sc.nextLong();
boolean b1 = sc.nextBoolean();
double num2 = sc.nextDouble();
String nome = sc.nextLine(); 
*/