package Avaliativo.ListaAvaliativa4;

public class atv20 {
    public static void main(String[] args) {
        double chico=1.50, ze=1.10;
        int cont=0;

        while (ze <= chico)  {
            cont++;
            ze+=0.03;
            chico+=0.02;

        }
        System.out.print("Zé ficou maior que chico em "+cont+" anos");
        
    }
    
}
