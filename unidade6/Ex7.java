package unidade6;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor (máx 20): ");
        int tamanho = scan.nextInt();
        int[] vetor = new int[tamanho];
        int numero;
        boolean existe;

        for (int i = 0; i < vetor.length; i++) {

            do {
                existe = false;

                System.out.println("Digite um número inteiro: ");
                numero = scan.nextInt();

                for (int j = 0; j < i; j++) {
                    if (vetor[j] == numero) {
                        existe = true;
                        System.out.println("Número já existe! Digite outro.");
                    }
                }

            } while (existe);

            vetor[i] = numero;
        }

        System.out.println("Vetor em ordem crescente: ");
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int troca = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = troca;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        scan.close();
}
}
