package Avaliativo.ListaAvaliativa8;
public class atv9 {
    public static void main(String[] args) {
        int mat[][] = new int [5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = 0;
                if(i==j)    {
                    mat[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" "+mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
