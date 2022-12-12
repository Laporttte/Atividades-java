package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv5 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        File arq = new File ("Avaliativo\\ListaAvaliativa10\\arq.txt");

        if (arq.exists()) {
            System.out.println("Arquivo existe.");
            System.out.println("Digite o caracter: ");
            char caracter = sc.next().charAt(0);
            contaCaracter(arq, caracter);
            sc.close();
        } else {
            System.out.println("O arq não existe.");
        }
    }
    public static void contaCaracter(File arq, char caracter) throws IOException {
        String textoTemp="";
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
        for (int i = 0; i < textoTemp.length(); i++) {
            if(textoTemp.charAt(i)==caracter) {
                cont++;
            }
        }
        System.out.println("Quantidade de caracteres: "+cont);
    }
}
