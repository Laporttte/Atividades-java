package Avaliativo.ListaAvaliativa10;

import java.io.*;
import java.util.*;

public class atv7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String txt1, txt2, fraseUsuario = " ";
        char op = ' ';
        System.out.print("Digite o nome do primeiro txt: ");
        txt1 = sc.nextLine();

        File arq1 = new File("Avaliativo\\ListaAvaliativa10\\" + txt1);

        if (!arq1.isFile()) {
            System.out.println("O arquivo foi criado, pois não existia um.");
        } else {
            System.out.println("O arquivo já existia.");
        }
        FileWriter escritor = new FileWriter(arq1, true);
        System.out.print("Deseja digitar um conteudo? (S/N)");
        op = sc.next().charAt(0);
        if (op == 's' || op == 'S') {
            System.out.print("Digite 0 para parar");
            while (!fraseUsuario.contains("0")) {
                fraseUsuario = sc.nextLine();
                escritor.write(fraseUsuario);
            }
        }
        escritor.close();

        System.out.println("\n\n\n");
        System.out.println("Digite o nome do segundo txt: ");
        txt2 = sc.next();

        File arq2 = new File("Avaliativo\\ListaAvaliativa10\\" + txt2);

        if (!arq2.isFile()) {
            System.out.println("O arquivo foi criado, pois não existia um.");
        } else {
            System.out.println("O arquivo já existia.");
        }

        EscreveGrande(arq1, arq2);
        sc.close();
    }

    public static void EscreveGrande(File arq1, File arq2) throws IOException {
        String ex = " ";
        try {
            FileReader leitor = new FileReader(arq1);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                ex += linha;
            }
            leitor.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter escritor2 = new FileWriter(arq2, true);

        escritor2.write(ex.toUpperCase());
        escritor2.close();
    }
}
