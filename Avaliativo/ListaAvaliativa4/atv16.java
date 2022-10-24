package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int sorteio, num, verif=0, cont=0;

        sorteio = rand.nextInt(1,1000);
        System.out.println(sorteio);

        while (verif==0)    {
            System.out.print("Valor: ");
                num = sc.nextInt();
                cont++;
            if (num < sorteio) {
                System.out.print("Chute um numero mais alto.");
            } else if (num > sorteio) {
                System.out.print("Chute um numero mais baixo.");
            } else {
                System.out.println("Acertou em "+cont+" tentativas.");
                verif =1;
            }
        }
        sc.close();
    }
    
}
