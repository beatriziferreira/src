package unidade4;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        /*SWITCH só le números inteiros ou caracteres! */
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Informe a quantidade de peças de roupas: ");
        int pecas = scan.nextInt();

        System.out.println("Informe o valor pago: ");
        double valor = scan.nextDouble();
        double valorDesconto;

        switch (pecas){
            case 1:
                System.out.println("Não tem desconto");
                break;
            case 2:
                valorDesconto = valor * 0.02;
                valor = valor - valorDesconto;
                System.out.println("Você ganhou um desconto de " + valorDesconto + " RS");
                System.out.println("O valor total é de: " + valor + " RS");
                break;
            case 3: 
                valorDesconto = valor * 0.06;
                valor = valor - valorDesconto;
                System.out.println("Você ganhou um desconto de " + valorDesconto + " RS");
                System.out.println("O valor total é de: " + valor + " RS");
                break;
            case 4:
                valorDesconto = valor * 0.10;
                valor = valor - valorDesconto;
                System.out.println("Você ganhou um desconto de " + valorDesconto + " RS");
                System.out.println("O valor total é de: " + valor + " RS");
                break;
            default:
                valorDesconto = valor * 0.14;
                valor = valor - valorDesconto;
                System.out.println("Você ganhou um desconto de " + String.format("%.2f", valorDesconto) + " RS");
                System.out.println("O valor total é de: " + valor + " RS");
                break;
        }
            scan.close();

		} 

	}


