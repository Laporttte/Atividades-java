package Avaliativo.ListaAvaliativa10;
import java.io.*;
import java.util.*;
public class atv14 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String arqName;
        int diaH, mesH, anoH;

        System.out.print("Digite o nome do arquivo (que contem as datas de nascimento.): ");
            arqName = sc.nextLine();

        File arq = new File("Avaliativo\\ListaAvaliativa10\\"+arqName);
        if(arq.exists()) {
            System.out.print("Dia de hoje: ");
                diaH = sc.nextInt();
            System.out.print("Mes atual: ");
                mesH = sc.nextInt();
            System.out.print("Ano atual: ");
                anoH = sc.nextInt();
            leituraArq1(arq, diaH, mesH, anoH);
        } else {
            System.out.print("Arquivo não existe.");
        }
        sc.close();

    }
    public static String transformaIntCalc(int diaH, int mesH, int anoH, String linha) {
        //recebe a linha da leituraArq1
        //le a linha e indentifica data (depois do -+1);
        /*
         * Se mesHoje > mesAnterior - Aniversario concluido (idade = anoAtual - anoAnterior)
         * Se mesHoje < mesAnterior - Aniversario não concluido (idade = (anoAtual - anoAnterior) - 1)
         * Se mesHoje == mesAnterior - Mes do aniversario, verifico o dia;
         * Se diaHoje >= diaAnterior - Aniversario concluido (idade = anoAtual - anoAnterior)
         * else (idade = (anoAtual - anoAnterior) - 1);
         */
        int idade;
        //separei os dias anteriores e transformei em int.
        int posiçãoSeparador = linha.indexOf("-")+1; //+1 para pular o espaço 
        int diaA = Integer.parseInt(linha.substring(posiçãoSeparador+1, posiçãoSeparador+3));
            System.out.println("Dia Anterior: "+diaA +"\t Atual: "+diaH);
        int mesA = Integer.parseInt(linha.substring(posiçãoSeparador+4, posiçãoSeparador+6));
            System.out.println("Mes Anterior: "+mesA +"\t Atual: "+mesH);
        int anoA = Integer.parseInt(linha.substring(posiçãoSeparador+7, posiçãoSeparador+11));
            System.out.println("Ano Anterior: "+anoA +"\t Atual: "+anoH);

        String linhatemp;
        //calculo a idade;
        if(mesH>mesA) {
            idade = anoH - anoA;
        } else if (mesH<mesA) {
            idade = (anoH - anoA) - 1;
        } else { //if (mesH==mesA)
            if (diaH>=diaA) {
                idade = anoH - anoA;
            } else {
                idade = (anoH - anoA) - 1;  
            }
        }

        linhatemp = linha.substring(0, posiçãoSeparador-2) + "idade: " + idade;

        return linhatemp;
    }

    public static void leituraArq1(File arq, int diaH, int mesH, int anoH) throws IOException {
        //cria arq e escritor
        File arqIdade = new File("Avaliativo\\ListaAvaliativa10\\idadePessoas.txt");
        
        if(!arqIdade.exists()) { // se nao existe.
            arqIdade.createNewFile();
        } 

        FileWriter escritorIdade = new FileWriter(arqIdade, true);

        //lê arq1 e escreve no arq2
        String linhaNova="";
        try {
            FileReader leitor = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                linhaNova = transformaIntCalc(diaH, mesH, anoH, linha);
                escritorIdade.write(linhaNova+"\n");
            }
            leitor.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        escritorIdade.close();
    }

}
