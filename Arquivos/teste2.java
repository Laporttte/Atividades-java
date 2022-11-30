import java.io.*;
public class teste2 {
   /*  public static void main (String[] args) throws IOException {
        String path = "C:/Users/PUC Minas/Desktop/Projetos PUC/Java/Arquivos/teste1.txt";
        //posso passar tanto o path quanto o nome em string => "teste1.txt"
        FileWriter escrita = new FileWriter(path);
        String txt = "Desse jeito, substitui todo o texto";
        escrita.write(txt);
        escrita.close();
        System.out.println("FIM");
    }*/
    public static void main (String[] args) throws IOException {
        String path = "C:/Users/PUC Minas/Desktop/Projetos PUC/Java/Arquivos";
        File arq = new File(path);       

        File [] arquivos = arq.listFiles();
        System.out.println(arquivos);

        FileReader leitor = new FileReader(arq);
        leitor.close();

        System.out.println("FIM");
    }
}
