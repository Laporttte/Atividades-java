package Laboratorio.Lista2;
import java.util.*;
public class Atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, imc, peso;

        System.out.print("Digite a sua altura: ");
            altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
            peso = sc.nextDouble();
            sc.close();

            imc = peso/ (altura*altura);

        System.out.print("\n\n\tTABELA IMC\n\n");
        System.out.print("Abaixo de 18,5 - Abaixo do peso\n");
        System.out.print("Entre 18,5 e 25 - Peso normal\n");
        System.out.print("Entre 25 e 30 - Acima do peso\n");
        System.out.print("Acima de 30 - Obeso\n\n\n");

        if (imc<18.5)   {
            System.out.print("Você está abaixo do peso.");
        } else if (imc >=18.5 && imc<25)    {
            System.out.print("Você está com peso normal.");
        } else if (imc >=25 && imc<30)  {
            System.out.print("Você está acima do peso.");
        } else {
            System.out.print("Você está obeso.");
        }
    }
}