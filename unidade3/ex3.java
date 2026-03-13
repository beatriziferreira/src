import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Digite o valor que deseja: ");
        Scanner teclado = new Scanner (System.in);
        double valor = teclado.nextDouble();
        final double gasolina = 5.75;
        double valorFinal = valor / gasolina;
        System.out.println("Voce conseguiu colocar: " + valorFinal + " litros");
        teclado.close();


        

    }
    
}
