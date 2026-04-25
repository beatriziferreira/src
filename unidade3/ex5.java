package unidade3;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de galinhas: ");
        Scanner teclado = new Scanner (System.in);
        int galinhas = teclado.nextInt();
        final double valorChip = 4.00;
        final double valorAlimento = 7.00;
        double valorTotal = (valorAlimento + valorChip) * galinhas;
        System.out.println("O valor a ser gasto é: " + valorTotal + " RS");
        teclado.close();
    }
    
}
