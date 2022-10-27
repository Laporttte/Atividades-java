package Exemplos;
import java.util.*;
public class jogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opção, posicao;
        boolean ganhador = false;
        int [] verificaEspaco = new int [9];

        // DECLARAÇÃO MATRIZ //

        String player1="x",  bot ="o", vertical=" | ", vazio="☻";
        String [][] velha = new String [3][5];

        velha[0][0] = vazio; 
        velha[0][1] = vertical;  //divisao
        velha[0][2] = vazio;
        velha[0][3] = vertical;  //divisao
        velha[0][4] = vazio;
//        /n;
        velha[1][0] = vazio;
        velha[1][1] = vertical;  //divisao
        velha[1][2] = vazio;
        velha[1][3] = vertical;  //divisao
        velha[1][4] = vazio;
//      /n
        velha[2][0] = vazio;
        velha[2][1] = vertical;  //divisao
        velha[2][2] = vazio;
        velha[2][3] = vertical;  //divisao
        velha[2][4] = vazio;



        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n(1) - Jogar solo.");
        System.out.print("\n(2) - Instruções.");
        System.out.print("\n(3) - Sobre.");
        System.out.print("\nEscolha a opção: ");
            opção = sc.nextInt();
            
        switch(opção) {
            case 1: //Jogar solo
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nvocê escolheu jogar solo.\n\n\n");
            imprimejogo(velha);

            while (ganhador==false) { //enquanto nao tiver um ganhador
                  posicao = leitura();

                  boolean tem = false;
                  int i;

                for (i = 0; i < verificaEspaco.length; i++) {
                    if (posicao == verificaEspaco[i]){ //se ja tiver o numero armazenado, peço pra ler dnv, se nao, armazeno e passo pro cod;
                        tem = true;
                    }
                }
                    if (tem==true) {
                        posicao = leitura();
                    } else {
                        verificaEspaco[i] = posicao;
                        escolhajogo(posicao, velha, player1);   

                    }
                ganhador = verifica();
            }

            break;
            case 2:
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nInstruções:\n");
            break;
            case 3:
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nEsse jogo foi criado por artur.\nData Inicial: <25/10;\nVersão 0.1");
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
    public static void escolhajogo(int posicao, String [][]velha, String player1){
        int linha=0, coluna=0;

        //defino a linha baseada no numero escolhido pelo teclado numerico
        if (posicao == 7 || posicao == 8 || posicao == 9){
            linha = 0;
        }else if (posicao == 4 || posicao == 5 || posicao == 6){
            linha = 1;
        }else if (posicao == 1 || posicao == 2 || posicao == 3){
            linha = 2;
        }
        //defino a coluna baseada no numero escolhido pelo teclado numerico
        if (posicao == 7 || posicao == 4 || posicao == 1){
            coluna = 0;
        }else if (posicao == 8 || posicao == 5 || posicao == 2){
            coluna = 2;
        }else if (posicao == 9 || posicao == 6 || posicao == 3){
            coluna = 4;
        }
        //atribuo na posicao do usuario
        velha[linha][coluna] = player1;

    }
    public static boolean verifica(){
        boolean ganhou = false;
        return ganhou;
    }

    public static int leitura() {
        int read;
        Scanner sc = new Scanner(System.in);

        System.out.print("Posição: ");
            read = sc.nextInt();

        return read;
    }
}