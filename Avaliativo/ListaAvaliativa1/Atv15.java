package Avaliativo.ListaAvaliativa1;
import java.util.*;
public class Atv15 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Double x,y, Pita;

        System.out.print("Valor do ponto x: ");
            x = sc.nextDouble();
        System.out.print("Valor do ponto y: ");
            y = sc.nextDouble();
            sc.close();
            
            Pita = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)); 

        System.out.print("A distancia é: "+Pita);
    }
    
}
