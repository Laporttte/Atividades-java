package Laboratorio.Lista14;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dd = "vazio", mm = "vazio", yyyy = "vazio";
        String data, dataTemp;
        String numeros = "0123456789";
        int posBarra;

        System.out.print("Digite a data (dd/mm/yyyy): ");
            data = sc.nextLine();

        dataTemp = data;

            posBarra = dataTemp.indexOf("/"); //vai receber 3
            if(dd.equals("vazio")) { // se estiver vazio, vai receber o dia;
                dd = dataTemp.substring(0, posBarra);
            }
            dataTemp = dataTemp.substring(posBarra+1, dataTemp.length()); //resetar o data temp, tirando o dd e a /

            posBarra = dataTemp.indexOf("/"); //resetar o posbarra e receber novo valor

            if(mm.equals("vazio")) { // se estiver vazio, vai receber o mes;
                mm = dataTemp.substring(0, posBarra);
            }
            yyyy = dataTemp.substring(posBarra+1, (dataTemp.length()));

            System.out.println("dia "+dd);
            System.out.println("mes "+mm);
            System.out.println("ano "+yyyy);
        sc.close();
    }
}
