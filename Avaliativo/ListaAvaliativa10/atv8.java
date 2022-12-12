package Avaliativo.ListaAvaliativa10;

import java.io.*;
import java.util.*;

public class atv8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String txt1, txt2, fraseUsuario = " ";
        char op = ' ';
        System.out.print("Digite o nome do primeiro txt: ");
        txt1 = sc.nextLine();

        File arq1 = new File("Avaliativo\\ListaAvaliativa10\\" + txt1);

        if (!arq1.isFile()) {
            System.out.println("O arquivo foi criado, pois não existia um.");
                FileWriter escritor = new FileWriter(arq1, true);
                System.out.print("Deseja digitar um conteudo? (S/N)");
                op = sc.next().charAt(0);
                if (op == 's' || op == 'S') {
                    System.out.print("Digite 0 para parar: ");
                    while (!fraseUsuario.contains("0")) {
                        fraseUsuario = sc.nextLine();
                        escritor.write(fraseUsuario);
                    }
                }
                escritor.close();
        } else {
            System.out.println("O arquivo já existia.");
        }

        System.out.println("\n\n\n");
        System.out.println("Digite o nome do segundo txt: ");
        txt2 = sc.nextLine();

        File arq2 = new File("Avaliativo\\ListaAvaliativa10\\" + txt2);

        if (!arq2.isFile()) {
            System.out.println("O arquivo foi criado, pois não existia um.");
                arq2.createNewFile();

                FileWriter escritor2 = new FileWriter(arq1, true);
                System.out.print("Deseja digitar um conteudo? (S/N)");
                op = sc.next().charAt(0);
                if (op == 's' || op == 'S') {
                    System.out.print("Digite 0 para parar: ");
                    while (!fraseUsuario.contains("0")) {
                        fraseUsuario = sc.nextLine();
                        escritor2.write(fraseUsuario);
                    }
                }
            escritor2.close();

        } else {
            System.out.println("O arquivo já existia.");
        }

            File arq3 = new File("Avaliativo\\ListaAvaliativa10\\arq3.txt");
            
            if (!arq3.isFile()) {
                System.out.println("O arquivo foi criado, pois não existia um.");
            } else {
                System.out.println("O arquivo já existia.");
            }
        
        JuntaArq(arq1, arq2, arq3);
        sc.close();
    }

    public static void JuntaArq(File arq1, File arq2, File arq3) throws IOException {
        FileWriter escritor3 = new FileWriter(arq3, true);
        
        try {
            FileReader leitor = new FileReader(arq1);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                escritor3.write(linha);
            }
            leitor.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader leitor = new FileReader(arq2);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha2 = "";
            while ((linha2 = bufferedReader.readLine()) != null) {
                escritor3.write(linha2);
            }
            leitor.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        escritor3.close();

    }
}
