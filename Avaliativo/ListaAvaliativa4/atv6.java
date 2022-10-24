package Avaliativo.ListaAvaliativa4;

public class atv6 {
    public static void main(String[] args) {
        double soma=0, cem, somaCem=0;

        for (int i=1;i<=100;i++)  {
            soma+=i;
            cem = Math.pow(i,2);
            somaCem+=cem;
        }
        System.out.println((Math.pow(soma,2))+" - "+somaCem+" = "+((Math.pow(soma,2))-somaCem));
    }
    
}
