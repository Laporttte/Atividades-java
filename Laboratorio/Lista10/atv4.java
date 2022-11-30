import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = new int [10];
        int [] y = new int [10];
        int [] xy = new int [10];

        for (int i = 0; i < xy.length; i++) {
            System.out.print("x("+(i+1)+"): ");
                x [i] = sc.nextInt();
            System.out.print("y("+(i+1)+"): ");
                y [i] = sc.nextInt(); 

            xy [i] = x [i] * y [i];
        }
        System.out.print("\nProduto escalar: ");
        for (int i = 0; i < xy.length; i++) {
            System.out.print(" "+xy[i]);
        }



        sc.close();
    }
}
