package unidade6;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetor = new double[12];
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Escreva o valor real [ " + i + " ]: ");
            vetor[i] = scan.nextDouble();
            soma += vetor[i];
        }

        double media = soma / 12;
        System.out.println("Média: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Valores maiores que a média: " + vetor[i]);
            }
        }
        scan.close();

    }
}
