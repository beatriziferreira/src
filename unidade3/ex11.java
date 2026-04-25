package unidade3;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Informe a temperatura em celsius: ");
        Scanner teclado = new Scanner (System.in);
        double celsius = teclado.nextDouble();
        double farenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura em F: " + farenheit);
        teclado.close();
    }
}
