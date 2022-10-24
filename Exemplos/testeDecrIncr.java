package Exemplos;

public class testeDecrIncr {
    public static void main(String[] args) {
        int a=5, b = 2;

        int desafioUm = 5;
        System.out.println(desafioUm  += ++desafioUm );
        
        int desafioDois = 5;
        System.out.println(desafioDois  += desafioDois++);
        System.out.println(desafioDois);


    }
}
