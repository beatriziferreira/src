package unidade3;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        System.out.println("Digite o peso do prato: ");
        Scanner teclado = new Scanner (System.in);
        double pesoQuilo = teclado.nextDouble();
        final double pesoPrato = 0.75;
        final double precoQuilo = 25.00; 
        double precoFinal = (pesoQuilo - pesoPrato) * precoQuilo;
        System.out.println("Total a pagar: " + precoFinal);
        teclado.close();



    }

    
}
