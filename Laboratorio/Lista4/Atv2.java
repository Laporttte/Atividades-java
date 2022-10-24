package Laboratorio.Lista4;
import java.util.*;
public class Atv2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float altura, maior=0, menor=0;
        int x=0;

        while (x<15)    {
            System.out.print("Escreva a "+(x+1)+"º altura: ");
                altura = sc.nextFloat();

            if (altura>maior){ 
            maior = altura;
            } else if (altura<menor){
                menor = altura;
            }
            x++;
        }
            sc.close();
        System.out.print("\nA maior altura foi de: "+maior);
        System.out.print("\nA menor altura foi de: "+menor);
    }
}
