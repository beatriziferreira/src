package Unidade5;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Insira a quantidade de elementos: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Insira um número qualquer: ");
        double numero = sc.nextDouble();
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um valor real: ");
            numero = sc.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        sc.close();
    }
}
