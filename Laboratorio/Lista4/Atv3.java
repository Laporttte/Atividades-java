package Laboratorio.Lista4;
import java.util.*;
public class Atv3 {

    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        float neg=0, pos=0, x=0, num=1, valor=0;//num é iniciado com 1 pra entrar no while, mas depois o sc.nextFloat lê em cima. (dava pra usar do while);

        System.out.print("Digite 0 para parar a entrada de valores\n\n");
        while (num != 0)  {
            System.out.print("Numero: ");
                num = sc.nextFloat();
            valor = valor + num; //soma de todos os valores.
            x++;//vai contar quantos numeros foram lidos.
            if (num>0)  {   //numeros positivos
                pos++;
            } else if (num<0)   {   //numeros negativos
                neg++;
            }
        }
        x--;//tirar 1 porque na leitura do zero, x aumenta 1, mas zero tem que parar.
        
            sc.close();
        System.out.print("\n\nMédia aritmetica: "+valor/x);
        System.out.print("\nQuantidade de numeros positivos: "+(pos));
        System.out.print("\nQuantidade de numeros negativos: "+neg);
        System.out.print("\nPercentual de numeros positivos: "+(pos/x)*100+"%");
        System.out.print("\nPercentual de numeros negativos: "+(neg/x)*100+"%");
    }
}
