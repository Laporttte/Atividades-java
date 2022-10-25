package Avaliativo.ListaAvaliativa7;
import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] normal = new double [10];
        double [] quadrado = new double [10];

        System.out.println("Digite: ");
        for (int i = 0; i < normal.length; i++) {
            normal[i] = sc.nextInt();
        }
            sc.close();
        for (int i = 0; i < quadrado.length; i++) {
            quadrado[i] = normal[i]*normal[i];
        }

        System.out.print("Numeros lidos / numeros ao quadrado");
        for (int i = 0; i < quadrado.length; i++) {
            System.out.print("\nN: "+normal[i]+"\t\tQ: "+quadrado[i]);
        }
    }
    
}
/*
 * Ler um conjunto de n ́umeros reais, armazenando-o em vetor e calcular o quadrado das componentes
deste vetor, armazenando o resultado em outro vetor. Os conjuntos tˆem 10 elementos cada. Imprimir
todos os conjuntos.
 */