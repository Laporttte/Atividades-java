package Exemplos;
import java.util.*;
public class jogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opção, posicao;
        boolean ganhador = false;

        // DECLARAÇÃO MATRIZ //

        String player1="x",  player2 ="o", horizontal="_", vertical=" | ", vazio=" ";
        String [][] velha = new String [3][5];

        velha[0][0] = player1;
        velha[0][1] = vertical;
        velha[0][2] = player1;
        velha[0][3] = vertical;
        velha[0][4] = player1;
//        /n;
        velha[1][0] = player1;
        velha[1][1] = vertical;
        velha[1][2] = player1;
        velha[1][3] = vertical;
        velha[1][4] = player1;
//      /n
        velha[2][0] = player1;
        velha[2][1] = vertical;
        velha[2][2] = player1;
        velha[2][3] = vertical;
        velha[2][4] = player1;



        System.out.print("(1) - Jogar solo.");
        System.out.print("\n(2) - Jogar em dupla.");
        System.out.print("\n(3) - Sobre.");
        System.out.print("\nEscolha a opção: ");
            opção = sc.nextInt();
            
        switch(opção) {
            case 1: //Jogar solo
            System.out.print("\n\n\nvocê escolheu jogar solo.\n\n\n");
            imprimejogo(velha);
            while (ganhador==false) { //enquanto nao tiver um ganhador

            }

            break;
            case 2:
            System.out.print("\n\n\nvocê escolheu jogar em dupla.");
            break;
            case 3:
            System.out.print("\n\n\nEsse jogo foi criado por artur.\nData Inicial: <25/10;\nVersão 0.1");
            break;
        }

    }
     public static void imprimejogo(String [][]velha){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(velha[i][j]);
            }
            System.out.println("\n");
        }

    }
    
}
