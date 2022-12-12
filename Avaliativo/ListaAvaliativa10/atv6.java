package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv6 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        File arq = new File ("Avaliativo\\ListaAvaliativa10\\arq.txt");

        if (arq.exists()) {
            System.out.println("Arquivo existe.");
            alfabeto(arq);
        } else {
            System.out.println("O arq não existe.");
        }
        sc.close();
    }
    public static void alfabeto(File arq) throws IOException {
        String textoTemp="";
        String alfabeto="abcdefghijklmnopqrstuvwxyz";
        String [] [] alfaQnt = new String [alfabeto.length()] [2];
        int cont=0;
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                textoTemp+= linha;
            }
                leitor.close();
                bufferedReader.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
        for (int i = 0; i < alfabeto.length(); i++) {
            for (int j = 0; j < textoTemp.length(); j++) {
                if(textoTemp.charAt(j)==alfabeto.charAt(i)) { //se for, imprime letra e quant;
                        cont++;
            }
            System.out.print(alfabeto.charAt(i));
            System.out.print(" ");
            System.out.print(cont);
            cont=0;


        }
    }
}
}