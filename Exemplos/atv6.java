package Exemplos;

import java.util.*;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntLetras = 0, totalLetras = 0, tamNum = 0, qualun;
        boolean leit = true;
        /*apagar */
        sc.close();
        System.out.println(leit);
        /*apagar */


        for (int i = 1; i <= 1000; i++) {
            tamNum = 0;
            int aux = i;
            while (aux != 0) { // descobre tamanho do num
                aux = aux / 10;
                tamNum++;
            }
            if (aux == 0) { // terminou de contar

                if (tamNum == 1) { // num tem 1 algarismo
                    totalLetras += unidade(i, qntLetras);
                    leit = false;

                } else if (tamNum == 2) { // num tem 2 algarismos
                    if (i / 10 == 1) { // dezenas de 10 a 19
                        totalLetras += semiDezena(i, qntLetras);
                    } else { // maior q 19 (pode ser 21 por exemplo, entao tenho que descobrir qual dezena e
                             // qual unidade)
                        int qualdez = i; // recebe i -> vira uma dezena com valor zero -> chamo a função e identifico o
                                         // tam de letras e armazeno.
                        qualdez = (qualdez / 10) * 10;
                        totalLetras += identificaDezena(qualdez, qntLetras);
                        qualun = i; // qual unidade recebe i -> encontra a unidade,
                        qualun = (qualun / 10);
                        totalLetras += unidade(qualun, qntLetras);
                    }
                    leit = false;
                }

             else if (tamNum == 3) { // num tem 3 algarismos
                int qualcent = i;
                qualcent = (qualcent / 100);
                qualcent = (qualcent *100);
                totalLetras += identificaCentena(qualcent, qntLetras);
                int qualdez = i; // recebe i -> vira uma dezena com valor zero -> chamo a função e identifico o
                // tam de letras e armazeno.
                qualdez = (qualdez / 10);
                qualdez = (qualdez%10);
                totalLetras += identificaDezena(qualdez, qntLetras);
                leit = false;
            } else if (tamNum == 4) { // num tem 4 algarismos
                System.out.println("é mil");
                totalLetras += 3; // mil tem 3 letras;
                leit = false;
            }
        }
    }
        System.out.println(totalLetras);

    }

    public static int unidade(int i, int qntLetras) { // ele vai contar os numeros de 1-9;
        int qualun = 0;
        qualun = i;
        if (qualun == 1) {
            qntLetras += 2;
        }
        if (qualun == 5) { // numeros que possuem 5 letras
            qntLetras += 5;
        }
        if (qualun == 6 || qualun == 7 || qualun == 8 || qualun == 9 || qualun == 2 || qualun == 3) { // numeros que tem
                                                                                                      // 4 letras
            qntLetras += 4;
        }
        if (qualun == 4) { // numeros que tem 4 letras
            qntLetras += 6;
        }
        return qntLetras;
    }

    public static int semiDezena(int i, int qntLetras) { // ele vai contar os numeros de 10-19
        // dez 3 - onze 4 - doze 4 - treze 5 - quatorze 8 - quinze 6 - dezesseis 9 -
        // dezessete 9 - dezoito 7 - dezenove 8
        if (i == 10) {
            qntLetras += 3;
        }
        if (i == 11 || i == 12) {
            qntLetras += 4;
        }
        if (i == 13) {
            qntLetras += 5;
        }
        if (i == 16 || i == 17) {
            qntLetras += 9;
        }
        if (i == 14 || i == 19) {
            qntLetras += 8;
        }
        if (i == 15) {
            qntLetras += 6;
        }
        if (i == 18) {
            qntLetras += 7;
        }
        return qntLetras;
    }

    public static int identificaDezena(int qualdez, int qntLetras) { // ele vai identificar se a dezena é 20 - 90;
        // vinte 5 - trinta 6 - quarenta 8 - cinquenta 9 - setenta 7 - sessenta 8 -
        // oitenta 7 - noventa 7
        if (qualdez == 20) {
            qntLetras += 5;
        }
        if (qualdez == 30) {
            qntLetras += 6;
        }
        if (qualdez == 40 || qualdez == 60) {
            qntLetras += 8;
        }
        if (qualdez == 50) {
            qntLetras += 9;
        }
        if (qualdez == 70 || qualdez == 80 || qualdez == 90) {
            qntLetras += 8;
        }
        return qntLetras;
    }

    public static int identificaCentena(int qualcent, int qntLetras) { // ele vai identificar se a centena é 100 - 900;
        // cem 3 - duzentos 8 - trezentos 9 - quatrocentos 12 - quinhentos 10 -
        // seiscentos 10 - setecentos 10 - oitocentos 10 - novecentos 10
        if (qualcent == 100) {
            qntLetras += 3;
        }
        if (qualcent == 200) {
            qntLetras += 8;
        }
        if (qualcent == 400) {
            qntLetras += 12;
        }
        if (qualcent == 300) {
            qntLetras += 9;
        }
        if (qualcent == 500 || qualcent == 600 || qualcent == 700 || qualcent == 800 || qualcent == 900) {
            qntLetras += 10;
        }
        return qntLetras;
    }

}
