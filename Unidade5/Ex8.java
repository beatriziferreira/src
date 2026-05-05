package Unidade5;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
       System.out.println("Insira a quantidade de elementos: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double numero = 0;
        double menor = 0;
        int soma = 0;
        double media = 0;
        int countPositivos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um valor inteiro: ");
            numero = sc.nextDouble();
            if (numero < 0) {
                if (numero < menor) {
                    menor = numero;
                }
            } else {
                soma += numero;
                countPositivos++;
            }
            
        }
        media = (double) soma / countPositivos;
        System.out.println("A média dos números positivos é: " + String.format("%.2f", media));
        System.out.println("O menor valor negativo é: " + menor);
        sc.close();
    }
    
}
