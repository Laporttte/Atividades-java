package Exemplos.ExerciciosMichele;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
    float F, C;
        
        System.out.println("\nDigite a temperatura em Farenheit");
            F = sc.nextFloat();
            C = (F-32)*5/9;
        System.out.println("\nFarenheint: " + F);
        System.out.printf("Celsius: " + "%.2f", C);
        sc.close();
     }
}
//https://pt.tutorialcup.com/java/how-to-limit-decimal-places-in-java.htm#:~:text=Usando%20Math.,-round%20()&text=Os%20Math.,10.0%20no%20round()%20m%C3%A9todo.