import java.util.*;
public class atv3nw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dd = "vazio", mm = "vazio", yyyy = "vazio";
        String data;
        String numeros = "0123456789";
        int num=0;
        System.out.print("Digite a data (dd/mm/yyyy): ");
            data = sc.nextLine();

        if(data.indexOf("/")!=2 && data.lastIndexOf("/")!=5) {
            System.out.print("Não estão certas");
        }else {
            String frutas[] = data.split("/");
            dd = frutas[0]; //imprime banana
            mm = frutas[1]; //imprime banana
            yyyy = frutas[2]; //imprime banana

            for (int i = 0; i < dd.length(); i++) {
                for (int j = 0; j < numeros.length(); j++) {
                    if (dd.charAt(i)==numeros.charAt(j)) {
                        num++;
                    }
                }
            }
            for (int i = 0; i < mm.length(); i++) {
                for (int j = 0; j < numeros.length(); j++) {
                    if (mm.charAt(i)==numeros.charAt(j)) {
                        num++;
                    }
                }
            }
            for (int i = 0; i < yyyy.length(); i++) {
                for (int j = 0; j < numeros.length(); j++) {
                    if (yyyy.charAt(i)==numeros.charAt(j)) {
                        num++;
                    }
                }
            }
            if(num==8) {
                int dia = Integer.parseInt(frutas[0]);
                int mes = Integer.parseInt(frutas[1]);
                int ano = Integer.parseInt(frutas[2]);
                System.out.println("dia: "+dia);
                System.out.println("mes: "+mes);
                System.out.println("ano: "+ano);
            }
        }
        sc.close();
    }
}
