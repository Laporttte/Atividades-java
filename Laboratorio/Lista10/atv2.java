import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int [5];
        int soma=0, media=0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            soma+=vet[i];
        }
            sc.close();

        media = soma/5;

        System.out.print("\nMaior: ");
        for (int i = 0; i < vet.length; i++) { //for dos maiores 
            if (vet[i]>media)  {
                System.out.print(" "+vet[i]);
            }
        }

        System.out.print("\nMenor: ");
        for (int i=0; i<vet.length; i++)    { //for dos menores 
            if (vet[i]<media) {
                System.out.print(" "+vet[i]);
            }
        }

        System.out.println("\nMédia = "+media);
    }
}