package unidade3;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        System.out.println("Insira o valor da compra: ");
        Scanner teclado = new Scanner (System.in);
        int valorCompra = teclado.nextInt();
        System.out.println("Insira o valor dado pelo cliente: ");
        int valorPago = teclado.nextInt();
       
        int troco = valorPago - valorCompra;

        int notas100 = troco / 100;
        troco = troco % 100;

        int notas10 = troco / 10;
        troco = troco % 10;

        int notas1 = troco;

        int totalNotas = notas100 + notas10 + notas1;

        System.out.println("O número mínimo de notas de troco é: " + totalNotas);
        System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
        System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
        System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);

        teclado.close();





    }
}
