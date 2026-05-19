package unidade6;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.println("Escreva um valor inteiro: ");
            vetor[i] = scan.nextInt();
        }


        System.out.println("Vetor na ordem inversa: ");

        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }

        scan.close();
        
    }

}
