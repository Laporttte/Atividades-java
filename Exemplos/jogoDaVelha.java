package Exemplos;
import java.util.*;
public class jogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opção, posicao;

        System.out.print("(1) - Jogar solo.");
        System.out.print("\n(2) - Jogar em dupla.");
        System.out.print("\n(3) - Sobre.");
        System.out.print("\nEscolha a opção: ");
            opção = sc.nextInt();
            clearConsole();
        switch(opção) {
            case 1: //Jogar solo
            System.out.print("cls"+ "você escolheu jogar solo,");
            break;
            case 2:

            break;
            case 3:

            break;
        }





    }
    public final static void clearConsole(){

        try {
            Thread.sleep(1000);     // Espera 1 segundo para ver a mágica acontecer
            new ProcessBuilder("cls").inheritIO().start().waitFor();      // Para linux (acho que para mac também)
        }
        catch (final Exception e){
        //  Tratar Exceptions
        }
    }
    
}
