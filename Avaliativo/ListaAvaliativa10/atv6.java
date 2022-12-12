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
            cont=0;
            for (int j = 0; j < textoTemp.length(); j++) {
                alfaQnt [i][0] = String.valueOf((alfabeto.charAt(i)));
                if(textoTemp.charAt(j)==alfabeto.charAt(i)) { //se for, imprime letra e quant;
                        cont++;
            }
            alfaQnt [i][1] = String.valueOf(cont);
            }
        }
        for (int i = 0; i < alfaQnt.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(alfaQnt [i][j]+" ");
            }
            System.out.print("\n");
        }
}
}