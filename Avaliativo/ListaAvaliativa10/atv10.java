package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv10 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String fraseUsuario="";

        System.out.println("Digite a palavra: ");
            String word = sc.next();
            sc.close();

        File arq = new File ("Avaliativo\\ListaAvaliativa10\\arq.txt");

        if (arq.exists()) {
            System.out.println("Arquivo existe e possui "+qntPalavras(arq, word) + " palavras informadas");
        } else {
            arq.createNewFile();
            System.out.println("O arq não existe, mas foi criado.");
            FileWriter escritor = new FileWriter (arq);
            System.out.print("Deseja digitar um conteudo? (S/N)");
            char op = sc.next().charAt(0);
            if (op == 's' || op == 'S') {
                System.out.print("Digite 0 para parar");
                while (!fraseUsuario.contains("0")) {
                    fraseUsuario = sc.nextLine();
                    escritor.write(fraseUsuario);
                }
            }
            System.out.println("Arquivo existe e possui "+qntPalavras(arq, word) + " palavras informadas");
            escritor.close();
        }
    }
    public static int qntPalavras(File arq, String word) throws IOException {
        int qnt=0;
        String texto="";
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                texto+=linha;
            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        texto = texto.replace(word, "0");
            for (int i = 0; i < texto.length(); i++) {
                if(texto.charAt(i)=='0') {
                    qnt++;
                }
            }
        return qnt;
    }
}
