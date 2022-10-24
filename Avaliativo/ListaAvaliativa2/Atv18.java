package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv18 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int horaInicial, minInicial, horaFinal, minFinal, hora_result, min_result=0;

        System.out.print("Digite a hora da entrada: ");
            horaInicial = sc.nextInt();
        System.out.print("Digite os minutos da entrada: ");
            minInicial = sc.nextInt();

        System.out.print("Digite a hora da saída: ");
            horaFinal = sc.nextInt();
        System.out.print("Digite os minutos da saída: ");
            minFinal = sc.nextInt();
            sc.close();

        if (horaFinal > horaInicial)    { 
            hora_result = horaFinal - horaInicial;
        } else { 
            hora_result = (24-horaInicial)+horaFinal;
        }

            if (minFinal > minInicial)     {  
                min_result = minFinal - minInicial;
            }
            if (min_result > 0) { 
                hora_result +=1;
            } 

            if (hora_result>0 &&  hora_result <3)  {
                System.out.print("O pagamento é de R$: "+hora_result*1);
            } else if (hora_result>=3 && hora_result<5) {
                System.out.printf("O pagamento é de R$: "+(hora_result*1.40)+" sem desconto, e R$"+(hora_result*1.40-0.80)+" com desconto.");
                System.out.print("\nO desconto de R$0.80 é devido 2h que são R$1.");
            } else {
                System.out.printf("O pagamento é de R$: "+(hora_result*2)+" sem desconto, e R$"+((hora_result*2-0.80)-1.20)+" com desconto.");
                System.out.print("\nO desconto de R$0.80 é devido 2h que são R$1.");
                System.out.print("\nO desconto de R$1.20 é devido 2h que são R$1,40.");
            } 
        
    }
}