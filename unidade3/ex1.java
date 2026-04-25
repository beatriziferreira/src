package unidade3;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Digite o valor da largura: ");
        Scanner teclado = new Scanner (System.in);
        double largura = teclado.nextDouble();
        System.out.println("Digite o valor do comprimento: ");
        double comprimento = teclado.nextDouble();
        double area = largura * comprimento;
        System.out.println("Area: " + area);
        teclado.close();
    }
    
}
