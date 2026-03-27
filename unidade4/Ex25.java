package unidade4;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        float num1 = scan.nextFloat();

        System.out.println("insira outro número: ");
        float num2 = scan.nextFloat();

        System.out.println("Insira uma opção (1 - Adição / 2 - Subtrção / 3 - Multiplicação / 4 - Divisão): ");
        int opcao = scan.nextInt();
        float divisao = 0;
        
        switch (opcao) {
            case 1:
                float soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                float diferenca = num1 - num2;
                System.out.println(diferenca);
                break;
            case 3:
                float multiplicaco = num1 * num2;
                System.out.println(multiplicaco);
                break;
            case 4:
                if (num2 == 0)
                    System.out.println("Erro");
                else 
                    divisao = num1 / num2;
                    System.out.println(divisao);
                break;
                
        } scan.close();
    }
}