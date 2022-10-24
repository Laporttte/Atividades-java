package Exemplos;
import java.util.*;
public class atv6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qntLetras = 0, num;
        
        System.out.println("Digite o numero");
            num = sc.nextInt();

        if (contadorAlgarismo(num)==1)  { //unidade

            System.out.println("qnt un - "+unidade(num, qntLetras));

        } else if (contadorAlgarismo(num)==2)  { // dezenas

            if (num<19) {
                System.out.println("qnt dez - "+dezena(num, qntLetras));
            } else {
                int dezZero, unDezena;

                dezZero = (num/10)*10;
                unDezena = (num%10);

                System.out.println(dezZero);
                System.out.println("qnt dez - "+dezena(dezZero, qntLetras));
                System.out.println("qnt un - "+unidade(unDezena, qntLetras));
            }
            
        } else if (contadorAlgarismo(num)==3)  { //centenas
            int centZero, unCent, dezCent;

            centZero = (num/100)*100;
            dezCent = (num%100); dezCent = (dezCent/10)*10;
            unCent = (num%10);

            centena(centZero, qntLetras);
            System.out.println("qnt cent - "+centena(centZero, qntLetras));
            System.out.println("qnt dez - "+dezena(dezCent, qntLetras));
            System.out.println("qnt un - "+unidade(unCent, qntLetras));

        } else { //milhar

            System.out.println("qnt milhar - 4");
        
        }
       sc.close(); 
    }
    public static int centena(int qualcent, int qntLetras) { // ele vai identificar se a centena é 100 - 900;
        
        if (qualcent == 100) {
            qntLetras += 3;
        }
        if (qualcent == 200) {
            qntLetras += 8;
        }
        if (qualcent == 400) {
            qntLetras += 12;
        }
        if (qualcent == 300) {
            qntLetras += 9;
        }
        if (qualcent == 500 || qualcent == 600 || qualcent == 700 || qualcent == 800 || qualcent == 900) {
            qntLetras += 10;
        }
        return qntLetras;
    }

    public static int dezena(int num, int qntLetras) { // ele vai contar os numeros de 1-9;
        
        if (num/10==1) { //10 a 19
            if (num == 10) {
                qntLetras += 3;
            }
            if (num == 11 || num == 12) {
                qntLetras += 4;
            }
            if (num == 13) {
                qntLetras += 5;
            }
            if (num == 16 || num == 17) {
                qntLetras += 9;
            }
            if (num == 14 || num == 19) {
                qntLetras += 8;
            }
            if (num == 15) {
                qntLetras += 6;
            }
            if (num == 18) {
                qntLetras += 7;
            }
            return qntLetras;
        }

        else { //20 a 90

        // vinte 5 - trinta 6 - quarenta 8 - cinquenta 9 - setenta 7 - sessenta 8 - oitenta 7 - noventa 7
        if (num == 20) {
            qntLetras += 5;
        }
        if (num == 30) {
            qntLetras += 6;
        }
        if (num == 40 || num == 60) {
            qntLetras += 8;
        }
        if (num == 50) {
            qntLetras += 9;
        }
        if (num == 70 || num == 80 || num == 90) {
            qntLetras += 8;
        }
        return qntLetras;
        }

    }

    public static int unidade(int num, int qntLetras) { // ele vai contar os numeros de 1-9;
        int qualun = 0;
        qualun = num;
        if (qualun == 1) {
            qntLetras += 2;
        }
        if (qualun == 5) {
            qntLetras += 5;
        }
        if (qualun == 6 || qualun == 7 || qualun == 8 || qualun == 9 || qualun == 2 || qualun == 3) {                                                                                // 4 letras
            qntLetras += 4;
        }
        if (qualun == 4) {
            qntLetras += 6;
        }
        return qntLetras;
    }

    public static int contadorAlgarismo(int num)    {
        boolean auxCont=true;
        int auxNum=num, tamNum=0;

        while (auxCont)  {
            auxNum = auxNum/10;
            tamNum++;
            if (auxNum==0)  {
                auxCont=false;
            }
        }
        return tamNum;
    }


}
