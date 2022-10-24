package Laboratorio.Lista7;

public class atv1 {
    public static void main(String[] args) {
        int anoInicio=1996, anoAtual=2022;
        double salario=2000, aumento=0.015;

        for (int i=anoInicio; i<=anoAtual;i++ ) {

                salario=salario+(salario*aumento);
                aumento=aumento*2;
            
        }
        System.out.println(salario);
    }
    
}