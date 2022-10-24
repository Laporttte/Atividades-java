package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv20 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float imc, peso, altura;

        System.out.print("Altura: ");
            altura = sc.nextFloat();
        System.out.print("Peso: ");
            peso = sc.nextFloat();
            sc.close();
            
            imc = peso/(altura*altura);
        if (imc <= 18.5) {
            System.out.print("Abaixo do peso");
        } else if ((imc > 18.6) && imc <= 24.9) {
            System.out.print("Saudável");
        } else if ((imc > 25) && imc <= 29.9) {
            System.out.print("Peso em excesso");
        } else if ((imc > 30) && imc <= 34.9) {
            System.out.print("Obesidade grau I");
        } else if ((imc > 35) && imc <= 39.9) {
            System.out.print("Obesidade grau II (severa)");
        } else {
            System.out.print("Obesidade grau III (mórbida)");
    }
  }   
}
