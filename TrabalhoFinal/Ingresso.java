package TrabalhoFinal;
import java.util.Scanner;
public class Ingresso {
    int fila;
    int poltrona;
    String tipo;
    double preco;
    Scanner scan = new Scanner(System.in);

    public Ingresso(int fila, int poltrona, String tipo, double preco) {
        this.fila = fila;
        this.poltrona = poltrona;
        this.tipo = tipo;
        this.preco = preco;
    }

    public void comprar(Scanner scan) {
        if (tipo.equalsIgnoreCase("inteiro")) {
            if (fila == 0 || fila == 1) {
                preco = 15.0;
                System.out.println("Preço do ingresso (frente): R$ " + String.format("%.2f", preco));
            } else if (fila >= 2 && fila <= 7) {
                preco = 25.0;
                System.out.println("Preço do ingresso (meio): R$ " + String.format("%.2f", preco));
            } else {
                preco = 35.0;
                System.out.println("Preço do ingresso (VIP): R$ " + String.format("%.2f", preco));
            }
            

        } else if (tipo.equalsIgnoreCase("meia")) {
            if (fila == 0 || fila == 1) {
                preco = 7.5;
                System.out.println("Preço do ingresso (frente / meia): R$ " + String.format("%.2f", preco));
            } else if (fila >= 2 && fila <= 7) {
                preco = 12.5;
                System.out.println("Preço do ingresso (meio / meia): R$ " + String.format("%.2f", preco));
            } else {
                preco = 17.5;
                System.out.println("Preço do ingresso (VIP / meia): R$ " + String.format("%.2f", preco));
            }

        } else {
            do{
            System.out.println("Tipo de ingresso inválido. Por favor, escolha 'inteiro' ou 'meia'.");
            tipo = scan.next();
            } while (!tipo.equalsIgnoreCase("meia") && !tipo.equalsIgnoreCase("inteiro") );
        }
    }
}
