import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double [] num = new double [10];

        for (int i = 0; i < num.length; i++) {
            num [i] = sc.nextDouble();
        }
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(" "+num[i]);
        }
        sc.close();
    }
}
