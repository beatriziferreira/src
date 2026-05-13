package unidade6;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vetor = new double[12];
        double valorAjustadoPar = 0;
        double valorAjustadoImpar = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Escreva o valor real [ " + i + " ]: ");
            vetor[i] = scan.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                valorAjustadoPar = (vetor[i] * 0.02) + vetor[i];
                vetor[i] = valorAjustadoPar;
            } else {
                valorAjustadoImpar = (vetor[i] * 0.05) + vetor[i];
                vetor[i] = valorAjustadoImpar;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor atualizado [ " + i + " ]: " + vetor[i]);
        }
        scan.close();
    }
}
