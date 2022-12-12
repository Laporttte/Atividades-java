package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;

public class atv9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String arqEntrada, arqSaida;

        System.out.print("Digite o nome do arquivo (que contem dados): ");
            arqEntrada = sc.nextLine();

        System.out.print("Digite o nome do arquivo (que sera armazenado): ");
            arqSaida = sc.nextLine();

        File arq1 = new File("Avaliativo\\ListaAvaliativa10\\"+arqEntrada);
        if(arq1.exists()) {
            System.out.println("Lendo as cidades e sua população.");

                File arq2 = new File("Avaliativo\\ListaAvaliativa10\\"+arqSaida);
                if(arq1.exists()) {
                    System.out.println("Armazenando a cidade mais populosa.");
                } else {
                    System.out.println("Não existe esse arquivo, criando um novo...");
                    arq2.createNewFile();
                }

                leituraArq1(arq1, arq2);

        } else {
            System.out.println("Arquivo de entrada não existe.");
        }
        sc.close();

    }

    public static void leituraArq1(File arq1, File arq2) throws IOException {

        FileWriter escritorMaisPopu = new FileWriter(arq2);

        int maiorPop=0;     //armazena qual maior populacao.
        String linhaPop="";    //armazena a linha toda 
        String numeros="0123456789";
        int num, posIn=0, posTemp;
        String numTxt;

        try {
            FileReader leitor = new FileReader(arq1);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                    for (int j = 0; j < numeros.length(); j++) {
                            posTemp = linha.indexOf(numeros.charAt(j));
                        if (posTemp != -1) {posIn = linha.indexOf(numeros.charAt(j));}                      
                    }
                    numTxt = linha.substring(posIn, linha.length()); 
                    num = Integer.parseInt(numTxt);
                if(num>maiorPop) {
                    maiorPop = num;
                    linhaPop = linha;
                }  
            }
            leitor.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        escritorMaisPopu.write(linhaPop);

        escritorMaisPopu.close();
    }

}
