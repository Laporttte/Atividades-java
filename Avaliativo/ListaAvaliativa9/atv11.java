package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase = new String();

        System.out.print("Digite a frase: ");
            frase = sc.nextLine();
            sc.close();
            frase = frase.toLowerCase();

        char [] fraseVetor = frase.toCharArray();
        char [] vogais = {'a','e','i','o','u'};

        for (int i = 0; i < fraseVetor.length; i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (fraseVetor[i]!=vogais[j])   {
                    if (j==vogais.length-1)  {
                        System.out.print(fraseVetor[i]);
                    }
                } else {
                    break;
                }

            }
        }
    }
}