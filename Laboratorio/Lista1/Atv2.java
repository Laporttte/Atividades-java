package Laboratorio.Lista1;
import java.util.*;

public class Atv2 {
public static void main (String[] args) {      
    Scanner sc = new Scanner(System.in);
    double b=0, h=0, P, A, D;

    System.out.print("Digite o valor da altura do retangulo: ");
        h = sc.nextFloat();
    System.out.print("Digite o valor da base do retangulo: ");
        b = sc.nextFloat();
        sc.close();

        P = (b+b+h+h);
        A = (b*h);
        D = Math.sqrt((b*b)+(h*h));

    System.out.print("O valor do perimetro é: "+ P+ "\nO valor da area é: "+ A+ "\nO valor da diagonal é: "+ D);
    } 
}
     //Leia as medidas de um retangulo e calcule: perimetro, area do triangulo e diagonal;