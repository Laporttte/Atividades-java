package Laboratorio.Lista4;
import java.util.*;
public class Atv6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        float par=0, impar=0, med_par=0, med_geral=0, num, x=0;

        System.out.print("Para encerrar, digite 0.\n");
        do {
            System.out.print("Número: ");
                num = sc.nextFloat();
            med_geral = med_geral + num; //media geral vai salvar a soma dos numeros (tanto par quanto impar)
            if (num % 2 == 0)   { //par
                med_par = med_par + num;//media par vai salvar a soma dos numeros pares;
                par++; //vai salvar a quant. de numeros pares;
            } else if (num % 2 != 0)   { //impar
                impar++;
            }
            x++;          
        } while (num != 0);
            sc.close();
            x--; // como o do-while roda primeiro e depois confere, ele somou x+1 quando o valor digitado era zero (interfere na media, por isso x--)
            par--; //zero conta como par, por isso par-1;
        System.out.print("\nMédia: "+med_geral/x);
        System.out.print("\nQuant. números pares: "+par);
        System.out.print("\nMédia de números pares: "+med_par/par);
        System.out.print("\nQuant. números impares: "+impar);

    }
    
}
