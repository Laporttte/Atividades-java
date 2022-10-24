package Avaliativo.ListaAvaliativa3;
public class Atv10 {
    public static void main(String[] args) {
        int soma=0, y=0;
        for (int x=1; y<50;x++)  {
            if (x%2==0) {
                soma+=x;
                y++;
            }
        }
        System.out.println("Soma: "+soma);
    }
}
