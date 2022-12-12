package Avaliativo.ListaAvaliativa10;
import java.io.*;
public class facil {
    public static void main(String[] args)  throws IOException  {
        File arq = new File ("Avaliativo\\ListaAvaliativa10\\t1.txt");

        if (arq.exists()) {
            contalinhas(arq)   ;     }
    }
    public static void contalinhas(File arq) throws IOException {
        String ex =" ";
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                ex +=linha;
            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("00100010"+ex);
    }
    
}
