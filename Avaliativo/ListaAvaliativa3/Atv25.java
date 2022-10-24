package Avaliativo.ListaAvaliativa3;
public class Atv25 {
    public static void main(String[] args) {
        int soma=0;
        for (int x=0;x<1000;x++)    {
            if (x%3==0 || x%5==0)   {
                soma+=x;
            }
        }
        System.out.println(soma);
    }
}
