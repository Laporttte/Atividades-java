package Avaliativo.ListaAvaliativa10;
import java.io.*;
public class atv2 {
    public static void main(String[] args)  throws IOException  {
        File arq = new File ("Avaliativo\\ListaAvaliativa10\\arq.txt");

        if (arq.exists()) {
            System.out.println("Arquivo existe e possui "+contalinhas(arq));
        }
    }
    public static int contalinhas(File arq) throws IOException {
        int total=0;
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
                total++;
            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return total;
    }
    
}
