package Exemplos;
import java.util.*;
    public class funcao {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1, num2; 

            System.out.println("Escreva o 1 numero");
                num1 = sc.nextInt();
            System.out.println("Escreva o 2 numero");
                num2 = sc.nextInt();
                sc.close();
            //Chamando minha função e passando os parametros
            System.out.println(soma(num1, num2));
          
        }   //declarando minha função
          public static int soma (int num1, int num2) {

            int resultado;  //variavel que vai ser acessivel apenas pela funcao

            resultado = num1+num2;

            return resultado;
         } 
 
    }
