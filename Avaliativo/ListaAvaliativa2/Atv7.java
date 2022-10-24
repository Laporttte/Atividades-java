package Avaliativo.ListaAvaliativa2;
import java.util.*;
public class Atv7 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double preco, taxa; 
 String estado;

 System.out.print("Digite o preço: ");
  preco = sc.nextDouble();
 System.out.print("Digite a sigla do estado: ");
  estado = sc.next();
  estado = estado.toUpperCase();
  sc.close();

    switch (estado) {
        case "MG":
        taxa = preco + (preco*0.07);
        System.out.print("\nO preço com o imposto de "+estado+" é: "+taxa);
            break;
        case "SP":
        taxa = preco + (preco*0.12);
        System.out.print("\nO preço com o imposto de "+estado+" é: "+taxa);   
            break;
        case "RJ":
        taxa = preco + (preco*0.15);
        System.out.print("\nO preço com o imposto de "+estado+" é: "+taxa);   
            break;
        case "MS":
        taxa = preco + (preco*0.08);
        System.out.print("\nO preço com o imposto de "+estado+" é: "+taxa);  
            break;
        default:
        System.out.print("Sigla de estado inválida");
            break;
    }
 }
}
