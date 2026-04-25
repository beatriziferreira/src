package unidade3;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        System.out.println("Digite o valor do sapato: ");
        //criar scanner
        Scanner teclado = new Scanner (System.in);
    
        double valorSapato = teclado.nextDouble();
        double valorDesconto = (valorSapato * 12.0) / 100;
        double valorFinal = valorSapato - valorDesconto;
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O valor final do sapato é: " + valorFinal);
        teclado.close();


       
    }
}
