package Laboratorio.Lista5;

public class atv4 {
    public static void main(String[] args) {
        double num=2,  cobaia, soma=0, fat=1;

        for (int i=1; i<6;i++)  {
        cobaia = num;
        while (cobaia>=1) {
            fat *= cobaia;
            cobaia--;
        }
        soma += i/fat;
        fat=1;
        num+=2;
        }
    System.out.println(soma);
    }
}