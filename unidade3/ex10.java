package unidade3;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Informe o cateto 1: ");
        Scanner teclado = new Scanner (System.in);
        double cateto1 = teclado.nextDouble();
        System.out.println("Informe o cateto 2: ");
        double cateto2 = teclado.nextDouble();
        double somaCatetos = Math.pow(cateto1 , 2) + Math.pow(cateto2 , 2);
        double hipotenusa = Math.sqrt(somaCatetos);
        System.out.println("A hipotenusa é " + hipotenusa);
        teclado.close();

    }
}
