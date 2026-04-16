package unidade4;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Insira a pesagem de sua carta em gramas: ");
        Scanner scan = new Scanner(System.in);
        double peso = scan.nextDouble();
        if (peso <= 50) {
            double valorFrete = 0.45;
            System.out.println("O valor do frete é R$ " + valorFrete);
        } else {
            double pesoExcedido = peso - 50;
            double adicional = (pesoExcedido/20) + 1;
            double valorFrete = 0.45 + (adicional * 0.45);
            System.out.println("O valor do frete é de R$: " + String.format("%.2f", valorFrete));
        } 
        scan.close();
    
    }
}
