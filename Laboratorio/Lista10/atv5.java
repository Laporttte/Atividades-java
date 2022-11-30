import java.util.*;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] usuario = new int [10];
        int [] mult = new int [10];


        for (int i = 0; i < usuario.length; i++) {
            usuario [i] = sc.nextInt();
        }
        for (int i = 0; i < usuario.length; i++) {
            mult [i] = usuario[i]*5;
        }
        sc.close();

        for (int i = 0; i < usuario.length; i++) {
            System.out.print("\n1º "+usuario[i]+"\t2º "+mult[i]);
        }
    }
}
