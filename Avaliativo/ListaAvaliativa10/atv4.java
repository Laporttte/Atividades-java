package Avaliativo.ListaAvaliativa10;
import java.io.*;
public class atv4 {
    public static void main(String[] args)  throws IOException  {
        File arq = new File ("Avaliativo\\ListaAvaliativa10\\arq.txt");

        if (arq.exists()) {
            System.out.println("Arquivo existe.");
            contaVogaisCons(arq);
        } else {
            System.out.println("O arq não existe.");
        }
    }
    public static void contaVogaisCons(File arq) throws IOException {
        int vogais=0;
        int cons=0;
        String consoantes = "bcdfgjklmnpqrstvwxyz";
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    char caracter=linha.charAt(i);
                    if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
                        System.out.println(caracter);
                        vogais++;
                    }
                    for (int j = 0; j < consoantes.length(); j++) {
                        if(caracter==consoantes.charAt(j)) {
                            System.out.println(caracter);
                            cons++;
                        }
                    }
                }
            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Possui "+vogais+" vogais e "+cons+" consoantes.");
    }
}
