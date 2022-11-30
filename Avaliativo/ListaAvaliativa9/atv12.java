package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String palavra = new String();
        int qtnVogais=0;
        char [] vogais = {'a','e','i','o','u'};
        char caracter;

        System.out.print("Digite a palavra: ");
            palavra = sc.nextLine();
        
        System.out.print("Digite o caracter: ");
            caracter = sc.next().charAt(0);

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if(palavra.charAt(i)==vogais[j])    {
                    qtnVogais++;
                    palavra = palavra.replace(palavra.charAt(i), caracter);
                }    
            }
        }
            sc.close();
        System.out.println("\n\nQnt vogais: "+qtnVogais);
        System.out.println("Nova palavra: "+palavra);
    }
}
