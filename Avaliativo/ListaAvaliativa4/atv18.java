package Avaliativo.ListaAvaliativa4;

public class atv18 {
    public static void main(String[] args) {

        int tempAnt=0, ant=1, suc=1, soma=0;


            for (int i=1; ant<4000000; i++)   {
                tempAnt = ant;
                ant = ant + suc;
                suc = tempAnt;
                if (suc%2==0)    {
                    soma+=suc;
                }
                System.out.println("\n\n\n'value is not used--"+i);//Aparecia o aviso "var is not used, acionei a o linha pra sumir com ele"
            }
            System.out.print("\nSoma: "+soma);
    }    
}


