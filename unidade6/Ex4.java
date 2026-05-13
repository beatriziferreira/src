package unidade6;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[10];

        for (int i = 0; i < vetor1.length; i++){
            System.out.println("Escreva o valor inteiro [ " + i + " ]: ");
            vetor1[i] = scan.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++){
            System.out.println("Escreva o valor inteiro [ " + i + " ]: ");
            vetor2[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorSoma.length; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        for (int i = 0; i < vetorSoma.length; i++){
            System.out.println("Valor [ " + i + " ] do vetor 1: " + vetor1[i]);
            System.out.println("Valor [ " + i + " ] do vetor 2: " + vetor2[i]);
            System.out.println("------------");
            System.out.println("Soma [ " + i + " ]: " + vetorSoma[i]);
            System.out.println(" ");
            
        }
        scan.close();
    }
}
