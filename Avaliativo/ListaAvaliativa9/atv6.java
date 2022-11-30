package Avaliativo.ListaAvaliativa9;
import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome, sexo;
        int idade;
        
        System.out.print("nome: ");
        nome = sc.nextLine();
        System.out.print("sexo: ");
        sexo = sc.nextLine();
        System.out.print("idade: ");
        idade = sc.nextInt();
            sc.close();
        System.out.println(nome+", resultado: ");
        if((idade <25)&(sexo.toUpperCase().charAt(0)=='F')) {
            System.out.println("ACEITA");
        } else {
            System.out.println("NÃO ACEITA");
        }
    
    }

}
