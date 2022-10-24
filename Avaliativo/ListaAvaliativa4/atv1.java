package Avaliativo.ListaAvaliativa4;

public class atv1 {
    public static void main(String[] args) {
        double soma=0, cima=1, baixo=1;

        while (baixo<51)    {
            soma += cima/baixo;
            baixo++;
            cima+=2;
        }
        System.out.println("Resultado: "+soma);
    }
}
