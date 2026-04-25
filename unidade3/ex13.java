package unidade3;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        System.out.println("Insira a altura da parede(em metros): ");
        Scanner teclado = new Scanner (System.in);
        double altura = teclado.nextDouble();
        System.out.println("Insira o comprimento da parede(em metros): ");
        double comprimento = teclado.nextDouble();
        double area = altura * comprimento;
        double valor = 12.5 * 9 * area;
        System.out.println("O valor a ser gasto é de " + valor + " RS");
        teclado.close();

    }
}
