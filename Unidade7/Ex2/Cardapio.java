package Unidade7.Ex2;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Pedido[] pedido = new Pedido[10];
        Scanner scan = new Scanner(System.in);
        int totalPedidos = 0;
        int menu;
        int opcao;

        do {
            System.out.println("===LANCHONETE===");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Ver comanda");
            System.out.println("0 - Fechar e pagar");

            menu = scan.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Total a pagar: ");
                    System.out.println("Obrigado pela preferência!");

                    break;
                case 1:
                    System.out.println("===CARDÁPIO===");
                    System.out.println("1 - X-Burger (R$ 18.50)");
                    System.out.println("2 - X-Salada (R$ 16.00)");
                    System.out.println("3 - Suco Natural (R$ 8.00)");
                    opcao = scan.nextInt;

                    break;
                case 2:
                    break;
                default:
                    break;
            }

        } while (menu != 0);

    }
}
