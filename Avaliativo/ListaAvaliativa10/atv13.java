package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv13 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String nome="", dia="", mes="",ano=""; //telefone tem 0, então while tem que ser quando telefone for SOMENTE 0;

        System.out.println("Digite apenas \"0\" no nome para terminar a leitura.");
        while(!nome.equals("0")) {
            System.out.print("Digite o nome: ");
                nome=sc.nextLine();
                if(nome.equals("0")) {
                    break;
                }
            System.out.print("Dia de nascimento: ");
                dia=sc.nextLine();
            System.out.print("Mes de nascimento: ");
                mes=sc.nextLine();
            System.out.print("Ano de nascimento: ");
                ano=sc.nextLine();
            escreveArq(nome, dia, mes, ano);
        }
        sc.close();
    }
    public static void escreveArq (String nome, String dia, String mes, String ano)  throws IOException  {
        File arq = new File("Avaliativo\\ListaAvaliativa10\\DataNascimento.txt");

        if(!arq.exists()) {
            arq.createNewFile();
        }

        FileWriter escritor = new FileWriter(arq, true);
            escritor.append(nome+"\t"+" - "+dia+" "+mes+" "+ano+"\n");
            escritor.close();
    }
}
