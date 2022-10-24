package Laboratorio.Lista7;

public class atv6 {
    public static void main(String[] args) {
        int soma=0;

        for (int i = 1; i<2000000; i++) { 
            boolean primo = true;
            if (i!=1)   { 
                for (int j = 2; j < i; j++) { 
                    if (i % j == 0) {   
                        primo = false;
                        break;
                    }
                }
                if (primo == true) { 
                    soma+=i;
                }
            }
        }
        System.out.print("\nSoma: "+soma);
    }
}
