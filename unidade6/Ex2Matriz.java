package unidade6;

import java.util.Scanner;

public class Ex2Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite a nota do aluno [" + (linha + 1) + "] na prova [" + (coluna + 1) + "]: ");
                matriz[linha][coluna] = sc.nextDouble();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            double somaNotas = 0;
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                somaNotas += matriz[linha][coluna];
            }
            double mediaAluno = somaNotas / matriz[linha].length;
            System.out.println("Média do aluno " + (linha + 1) + ": " + mediaAluno);
        }

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            double somaNotasProva = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                somaNotasProva += matriz[linha][coluna];
            }
            double mediaProva = somaNotasProva / matriz.length;
            System.out.println("Média da prova " + (coluna + 1) + ": " + mediaProva);
        }

        sc.close();
    }
}
