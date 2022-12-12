package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv11 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String fraseUsuario="";


        System.out.print("Digite o nome do primeiro txt: ");
        String path = sc.nextLine();

        File arq = new File("Avaliativo\\ListaAvaliativa10\\" + path);

        if (arq.exists()) {
            System.out.println("Arquivo existe.");
            qntPalavras(arq);
        } else {
            arq.createNewFile();
            System.out.println("O arq não existe, mas foi criado.");
            FileWriter escritor = new FileWriter (arq);
            System.out.println("O arq não existe, mas foi criado.");
            System.out.print("Deseja digitar um conteudo? (S/N)");
                char op = sc.next().charAt(0);
                if (op == 's' || op == 'S') {
                    System.out.print("Digite 0 para parar");
                    while (!fraseUsuario.contains("0")) {
                        fraseUsuario = sc.nextLine();
                        escritor.write(fraseUsuario);
                    }
                }
            escritor.close();
            qntPalavras(arq);
            sc.close();
        }
    }
    public static void qntPalavras(File arq) throws IOException {
        int qntLinhas=0;
        int qntPalavras=0;

        String texto="";
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                qntPalavras++;
                texto+=linha;
                qntLinhas++;
                for (int j = 1; j < linha.length(); j++) {
                    if(linha.charAt(j)=='\n' || (linha.charAt(j-1)==' ' && linha.charAt(j)!='\n')) {
                        qntPalavras++;
                    }
                }

            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e ) {
                e.printStackTrace();
            }
        System.out.println("Existem "+qntLinhas+" linhas no arq.");
        System.out.println("Existem "+texto.length()+" caracteres no arq.");
        System.out.println("Existem "+qntPalavras+" palavras no arq.");


    }
}
