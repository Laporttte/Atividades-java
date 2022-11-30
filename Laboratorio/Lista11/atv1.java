import java.util.Random;
public class atv1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] [] mat = new int [4][4];
        int [] [] matCopia = new int [4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = rand.nextInt(20);
                if(mat[i][j]==0)    {
                    mat[i][j] =+1;
                }
                matCopia[i][j] = mat[i][j];

            }
        }

        for (int i = 0; i < matCopia.length; i++) {
            for (int j = 0; j < matCopia.length; j++) {
                if(i<j) {
                    matCopia[i][j]=0;
                }
            }
        }
        System.out.println("Matriz normal");
        for (int i = 0; i < matCopia.length; i++) {
            for (int j = 0; j < matCopia.length; j++) {
                System.out.print("\t"+mat[i][j] );
            }
            System.out.println("\n");
        }
        System.out.println("Matriz transformada");
        for (int i = 0; i < matCopia.length; i++) {
            for (int j = 0; j < matCopia.length; j++) {
                System.out.print("\t"+matCopia[i][j] );
            }
            System.out.println("\n");
        }
    }
}
