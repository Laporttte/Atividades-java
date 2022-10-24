package Avaliativo.ListaAvaliativa4;

public class atv4 {
    public static void main(String[] args) {
        int num=1, acertos=0;
        boolean ok = true;

        while (ok)    {
            for(int j=1; j<=20; j++)    {
                if (num%j==0)  {
                    acertos++;
                } else {
                    num++;
                    acertos=0;
                    j=1;
                }
                if (acertos==19)   {
                    System.out.println("De 1 a 20: "+num);
                    ok=false;
                }
            }
        }
    }
}
