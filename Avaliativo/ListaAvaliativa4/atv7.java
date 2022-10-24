package Avaliativo.ListaAvaliativa4;

public class atv7 {
    public static void main(String[] args) {
        int one, sec, soma;

        for (int i=1000;i<=9999;i++) {
            sec = i%100;
            one = i/100;
            soma = sec+one;
            
            if (Math.pow(soma,2)==i)  {
                System.out.println(i);
            }
        }
    }
}
