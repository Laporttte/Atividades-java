package Avaliativo.ListaAvaliativa9;
import java.util.*;;
public class atv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] modelo = new String [5];
        int [] consumo = new int [5];
        int maisEcon=0, menosEcon=0, maisEconId=0, menosEconId=0;
         
        for (int i = 0; i < consumo.length; i++) {
            System.out.print("Digite o modelo: ");
                modelo[i] = sc.next();
            System.out.print("Digite o consumo: ");
                consumo[i] = sc.nextInt();
            if(i==0) {
                maisEcon = consumo[i]; menosEcon = consumo[i];
                maisEconId=i;  menosEconId=i;
            } 
            if(consumo[i]<maisEcon) {
                maisEconId=i;maisEcon=consumo[i];
            }
            if(consumo[i]>menosEcon) {
                menosEconId=i;menosEcon=consumo[i];
            }
            
        }

        sc.close();
        System.out.println("\n\nO mais economico é: "+modelo[menosEconId]);
        for (int i = 0; i < consumo.length; i++) {
            System.out.println("Modelo: "+modelo[i]+" consome "+(1000/consumo[i]) +" litros");
        }


    }
}