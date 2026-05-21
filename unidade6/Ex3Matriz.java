package unidade6;

import java.util.Scanner;

public class Ex3Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] matrizMultiplicacao = new int[3][3];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int soma = 0;
                for (int k = 0; k < matriz[i].length; k++) {
                    soma += matriz[i][k] * matriz2[k][j];
                }
                matrizMultiplicacao[i][j] = soma;
            }
        }

        System.out.println("Resultado da multiplicação das matrizes:");
        for (int i = 0; i < matrizMultiplicacao.length; i++) {
            for (int j = 0; j < matrizMultiplicacao[i].length; j++) {
                System.out.print(matrizMultiplicacao[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    } 
}
