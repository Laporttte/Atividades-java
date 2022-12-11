import java.io.*;
import java.util.*;
//verificar se tem, se nao tiver, criar ->
//abrir e armazenar textos até q entre com 0
//fecho
//ler caracter por caracter e dar um SOUT
public class atv1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String fraseUsuario;
        Boolean termino = false;

        File arq = new File ("c:\\Avaliativo\\ListaAvaliativa10\\atv1.txt");
            
            if(!arq.isFile())    {
                System.out.println("O arquivo foi criado, pois não existia um.");
            } else {
                System.out.println("O arquivo já existia.");            
            }
            FileWriter escritor = new FileWriter(arq,true);
            

        while (termino == false)    {
            fraseUsuario = sc.nextLine();
                if (fraseUsuario.contains("0")) {
                    termino = true;
                }
            escritor.write(fraseUsuario);
        }
            sc.close();
            escritor.close();


        FileReader leitor = new FileReader(arq);
            System.out.print(leitor.read());
            leitor.close();

    }
}
