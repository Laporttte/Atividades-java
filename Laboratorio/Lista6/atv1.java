package Laboratorio.Lista6;
import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, cont = 0;

        System.out.print("A: ");
        a = sc.nextInt();
        System.out.print("B: ");
        b = sc.nextInt();
        sc.close();
        for (int i = a; i < b; i++) {                                     //roda de a até b
            boolean primo = true; // porque preciso declarar aqui, e não lá em cima?
            if (i!=1)   {
                for (int j = 2; j < i; j++) {                                 //roda de 2 até valor atual (i) verificando divisões
                    if (i % j == 0) {                                            //se tiver divisão limpa, nao é primo
                        primo = false;
                        break;
                    }
                } 
                if (primo == true) { 
                    cont++;
                }
            }
        }
        System.out.print("Quantidade de primos: " + cont);
    }
}