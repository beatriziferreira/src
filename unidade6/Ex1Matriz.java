package unidade6;

import java.util.Scanner;

public class Ex1Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite um valor inteiro para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }

        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        sc.close();
        lerDiagonalPrincipal(matriz);
        somarDiagonais(matriz);
    }

    public static void lerDiagonalPrincipal(int[][] matriz) {
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public static void somarDiagonais(int[][] matriz) {
        int somaPrincipal = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaPrincipal += matriz[i][i];
        }

        System.out.println("Soma da Diagonal Principal: " + somaPrincipal);
    }
}
