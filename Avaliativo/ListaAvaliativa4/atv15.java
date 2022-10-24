package Avaliativo.ListaAvaliativa4;
import java.util.*;
public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        float km, ms;
        boolean opcao = true;

        while (opcao)   {
            System.out.println("\n\n1 - km/h - m/s ");
            System.out.println("2 - m/s - km/h ");
            System.out.println("3 - Sair ");
            System.out.print("Opção: ");
                op = sc.nextInt();

        switch (op) {
            case 1:
            System.out.print("\nkm/h para m/s\nkm: ");
            km = sc.nextFloat();
            System.out.print("m/s convertido: "+(km/3.6));
            break;
            case 2:
            System.out.print("\nm/s para km/h\nm/s: ");
            ms = sc.nextFloat();
            System.out.print("km/h convertido: "+(ms*3.6));
            break;
            case 3:
            System.out.print("\nFinalizando. ");
            opcao = false;
            break;
            default:
            System.out.print("\nInválida.");
            break;
        }
    }
        sc.close();
        
    }
    
}
