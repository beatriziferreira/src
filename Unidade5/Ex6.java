package Unidade5;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        double somaAltura = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a altura da pessoa: ");
            float altura = scan.nextFloat();
            somaAltura += altura;
        }

        double mediaAltura = somaAltura / 20;
        System.out.println("A média das alturas é: "  + String.format("%.2f", mediaAltura));

        scan.close();
    }
}