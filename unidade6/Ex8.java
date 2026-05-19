package unidade6;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;

        do {
            System.out.print("Digite o tamanho do vetor (máximo 20): ");
            N = entrada.nextInt();
        } while (N < 1 || N > 20);

        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = entrada.nextDouble();
        }

        System.out.println("\nTabela de ocorrências:");
        System.out.println("-----------------------------");
        System.out.println("Valor\t\tQuantidade");
        System.out.println("-----------------------------");

        for (int i = 0; i < N; i++) {

            boolean jaContado = false;

            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    jaContado = true;
                    break;
                }
            }

            if (!jaContado) {
                int quantidade = 1;

                for (int j = i + 1; j < N; j++) {
                    if (vetor[i] == vetor[j]) {
                        quantidade++;
                    }
                }

                System.out.println(vetor[i] + "\t\t" + quantidade);
            }
        }

        entrada.close();
    }
}
