package unidade4;

import java.util.Scanner;
import java.util.Arrays;

public class Ex24 {
    public static void main(String[] args) {
      
        int[] valores = new int[3];

       Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        valores[0] = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        valores[1] = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valores[2] = sc.nextInt();

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        int opcao = sc.nextInt();

        
        Arrays.sort(valores);

        switch (opcao) {
            case 1:
                System.out.println("Ordem crescente:");
                for (int v : valores) {
                    System.out.print(v + " ");
                }
                break;

            case 2:
                System.out.println("Ordem decrescente:");
                for (int i = 2; i >= 0; i--) {
                    System.out.print(valores[i] + " ");
                }
                break;

            case 3:
                System.out.println("Maior valor no meio:");
                System.out.print(valores[0] + " " + valores[2] + " " + valores[1]);
                break;

            default:
                System.out.println("Opção inválida!");
           }  sc.close();
     }
}
       
        




    

