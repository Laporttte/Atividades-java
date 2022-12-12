package Avaliativo.ListaAvaliativa9;
import java.util.*;;
public class atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] nomes = new String [10];
        int [] idade = new int [10];
        int mais=0, menos=0, maisId=0, menosId=0;
         
        for (int i = 0; i < idade.length; i++) {

            System.out.print("nome: ");
                nomes [i] = sc.next();
            
            System.out.print("idade: ");
                idade [i] = sc.nextInt();
            if(idade[i]<0) 
                break;

            if(i==0) {
                mais = idade[i];  menos = idade[i];
                maisId=i; menosId=i;
            }
            if(idade[i]>mais) {
                mais = idade[i];
                maisId=i;
            }
             
            if(idade[i]<menos) {
                menos = idade[i];
                menosId=i;
            }
        }
        sc.close();
        System.out.println("A mais jovem é: "+nomes[menosId] + " com a idade: "+idade[menosId]);
        System.out.println("A mais velha é: "+nomes[maisId] + " com a idade: "+idade[maisId]);


    }
}