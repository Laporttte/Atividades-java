package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv12 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String nome="", telefone=""; //telefone tem 0, então while tem que ser quando telefone for SOMENTE 0;

        while(!telefone.equals("0")) {
            System.out.print("Digite o nome: ");
                nome=sc.nextLine();
            System.out.print("Digite o telefone: ");
                telefone=sc.nextLine();
            escreveArq(nome, telefone);
        }
        sc.close();
    }
    public static void escreveArq (String nome, String telefone)  throws IOException  {
        File arq = new File("Avaliativo\\ListaAvaliativa10\\listaTelefonica.txt");

        if(!arq.exists()) {
            arq.createNewFile();
        }

        FileWriter escritor = new FileWriter(arq, true);
            escritor.append(nome+"\t"+telefone+"\n");
            escritor.close();
    }
}
