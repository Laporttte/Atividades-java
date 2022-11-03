package Avaliativo.ListaAvaliativa8;
public class atv5 {
    public static void main(String[] args) {
        int [] vet = new int [5];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = ((i+ (5 *i))%(i+1));
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" "+vet[i]);
        }
    }
}
//Leia um vetor de 10 posic ̧ ̃oes e atribua valor 0 para todos os elementos que possu ́ırem valores negativos.