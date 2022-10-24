package Avaliativo.ListaAvaliativa5;
import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, min, seg;

        System.out.print("Digite as horas: ");
            h = sc.nextDouble();
        System.out.print("Digite as minutos: ");
            min = sc.nextDouble();
        System.out.print("Digite as segundos: ");
            seg = sc.nextDouble();
            sc.close();

        System.out.print("Segundos totais = "+ conversor(h, min, seg));

    }
    public static double conversor (Double h, Double min, double seg) {
        double segTotais=0;

        segTotais += seg;
        segTotais += h * 3600;
        segTotais += min * 60;

        return segTotais;
    }
}
