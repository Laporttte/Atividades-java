package Exemplos;
import java.util.*;
public class atvFlavio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura=0, raio=0;

        System.out.print("Digite a altura: ");
            altura = sc.nextDouble();
        System.out.print("Digite o raio: ");
            raio = sc.nextDouble();
            sc.close();

        System.out.print("Volume: "+volume(raio, altura));

    }
    public static double volume(double raio, double altura) {
        double v = 3.14*(raio*raio)*altura;

        return v;
    }
}
