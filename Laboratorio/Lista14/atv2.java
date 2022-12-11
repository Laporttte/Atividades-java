package Laboratorio.Lista14;
import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1="",s2="";
        int op;

        System.out.println("Digite sua opção (1-8): ");
            op = sc.nextInt();
        
        System.out.println("Digite s1: ");
            s1 = sc.nextLine();
        while (s1.length()>20) {
            System.out.println("Muito grande...");
                s1 = sc.nextLine();
        } 

        switch (op) {
            case 1:
            System.out.println("Lido na main, não funciona sem isso");
                break;
            case 2:
                System.out.print("Tamanho de s1: "+(s1.length()));
                break;
            case 3:
                System.out.println("Digite s2: ");
                    s2 = sc.nextLine();
                if(s1.compareTo(s2)==0) {
                    System.out.println("São iguais");
                } else if (s1.compareTo(s2)>0) {
                    System.out.println("s1 é maior");
                } else {
                    System.out.println("s2 é maior");
                }
            break;
            case 4:
                System.out.println("Digite s2: ");
                    s2 = sc.nextLine(); 
                System.out.println("s1 + s2 = "+s1+s2);
                break;
            case 5:
                System.out.println("s1 reversa: ");
                char [] s1Char = s1.toCharArray();
                for (int i = s1Char.length-1; i >=0 ; i--) {
                    System.out.print(s1Char[i]);
                }
            break;
            case 6:
                System.out.print("Informe o caracter: ");
                int cont=0;
                    String caracter = sc.next();
                s1 = s1.replace(caracter, ".");
                for (int i = 0; i < s1.length(); i++) {
                    if(s1.charAt(i)==".") {
                        cont++;
                    }
                }
                System.out.print("Existe "+cont+" ocorrencias");
            break;
            case 7:
            String c1;
            char c2;
                System.out.println("C1: ");
                    c1 = sc.nextLine();
                System.out.println("C2");
                    c2 = sc.next().charAt(0);
                int pos = s1.indexOf(c1);
                    char [] ch = s1.toCharArray;
                    ch[pos] = c2;
                    s1 = String.valueOf(ch);
                System.out.println(s1);
            break;
            case 8:
                System.out.println("s2: ");
                    s2 = sc.nextLine();
                if(s1.indexOf(s2)==-1){
                    System.out.println("Não é substring");
                } else {
                    System.out.println("É substring");
                }
            break;
            case 9:
                System.out.println("Posicao inicial: ");
                   int posIn = sc.nextInt();
                System.out.println("Tamanho da substring: ");
                   int tam = sc.nextInt();
                String substring = s1.substring(posIn, tam+posIn);
            break;
            default:
            System.out.println("Opção incorreta ");
                break;
        }
        sc.close();
    }
    
}