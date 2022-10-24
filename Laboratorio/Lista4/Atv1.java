package Laboratorio.Lista4;

public class Atv1 {
    public static void main(String[] args) {
        int x = 1, soma=0;

        while (x<=500)   {
            if ((x%3==0)&&x%2!=0)  {
                soma = soma+x;
            }
            x++;
        }
        System.out.print("Soma dos números impares multiplos de 3: "+soma);
    }
}
