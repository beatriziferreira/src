import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        System.out.println("Insira a litragem de gasolina: ");
        Scanner teclado = new Scanner (System.in);
        double gasolina = teclado.nextDouble();

        System.out.println("Insira a litragem de etanol: ");
        double etanol = teclado.nextDouble();

        double precoGas = gasolina * 5.75;
        double precoEtanol = etanol * 4.29;
        double total = precoEtanol + precoGas;

        System.out.println("O valor da gasolina é de: " + precoGas + " RS");
        System.out.println("O valor do etanol é de: " + precoEtanol + " RS");
        System.out.println("O valor total é de: " + total + " RS");
        
        teclado.close();

    }


}