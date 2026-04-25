package unidade3;
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        System.out.println("Insira o sua massa em KG: ");
        Scanner teclado = new Scanner (System.in);
        float massa = teclado.nextFloat();

        System.out.println("Insira o sua altura em metros: ");
        float altura = teclado.nextFloat();

        double imc = massa / Math.pow(altura , 2);
        System.out.println("Seu imc é de: " + imc);

        teclado.close();


    }
}
