import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Informe o raio da lata: ");
        Scanner teclado = new Scanner (System.in);
        double raio = teclado.nextDouble();
        System.out.println("Informe a altura da lata" );
        double altura = teclado.nextDouble();
        double pi = 3.14;
        double volume = (pi * Math.pow(raio, 2)) * altura;
        System.out.println("Volume da lata: " + volume);
        teclado.close();


    }
    
}
