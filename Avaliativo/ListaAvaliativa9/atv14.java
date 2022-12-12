package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String string1, string2="";
        int ascii=0;
        char carac;
        System.out.println("Digite a frase: ");
        string1 = sc.nextLine();
        
        if(string1.length()<=50) {
            char[] charArray = string1.toCharArray(); 
            for (int i = 0; i < charArray.length; i++) {
                ascii =  charArray[i];
                ascii = ascii+1;
                carac = (char) ascii;
                string2 += carac;
                ascii=0;
            }
            System.out.println(string2);

        }   else {
            System.out.println("Frase maior que 50 caracteres");
        }

        sc.close();
    }
}
