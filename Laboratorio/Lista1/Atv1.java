package Laboratorio.Lista1;
import java.util.*;

public class Atv1 {
public static void main (String[] args) {          
    Scanner sc = new Scanner(System.in);
    float media, n1, n2;

    System.out.print("Escreva a primeira nota: ");
        n1 = sc.nextFloat();
    System.out.print("Escreva a segunda nota: ");
        n2 = sc.nextFloat();
        sc.close();
        media = (n1+n2)/2;
    System.out.print("A média entre as notas foi: "+media);
    }    
}
 //leia duas notas e calcule a média.