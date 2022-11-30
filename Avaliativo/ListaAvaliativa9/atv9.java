package Avaliativo.ListaAvaliativa9;
import java.util.*;;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase;

        frase = sc.nextLine();
            sc.close();
            
        System.out.println("String = "+frase.replace('0','1'));

    }
}