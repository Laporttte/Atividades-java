package Laboratorio.Lista7;
public class atv5 {
    public static void main(String[] args) {
        int num, somaTodos=0, n=100;

            for (int x = 2; x <=n; x++) {
                num=x;
                somaTodos+=primo(num); 
            }
        System.out.print("Soma = "+(somaTodos));


    }

    public static int primo(int num) {
        boolean pr = true;
        for (int i = 1; i <= num &&pr==true; i++) {
            if (i!=1 & i!=num)  {
                if (num%i==0)   {
                    pr=false;
                }
            }
        }

        if (pr==false)  {
            return 0;
        } else {
            return num;
        }
        
    }
}