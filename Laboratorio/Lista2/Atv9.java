package Laboratorio.Lista2;
import java.util.*;
public class Atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, imc;
        String sexo;

        System.out.print("Digite a sua altura: ");
            altura = sc.nextDouble();
        System.out.print("Digite seu sexo: ");
            sexo = sc.next();
            sexo = sexo.toLowerCase(); //transforma caixa alta pra normal
            sc.close();

            if (sexo.equals("feminino")) {
                imc = (62.1*altura)-44.7;
                System.out.print("Seu peso ideal é: "+imc);
            } else if (sexo.equals("masculino")) {
                imc = (72.7*altura)-58;
                System.out.print("Seu peso ideal é: "+imc);
        }
    }
}