import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Informe o valor em dolar: ");
        Scanner teclado = new Scanner (System.in);
        double dolar = teclado.nextDouble();
        double valorDolar = 5.65;
        double reais = dolar * valorDolar;
        System.out.println("Total em reais: " + reais);
        teclado.close();
    }
}
