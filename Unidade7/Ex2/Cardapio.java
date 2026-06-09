package Unidade7.Ex2;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Pedido[] pedido = new Pedido[10];
        Scanner scan = new Scanner(System.in);
        int totalPedidos = 0;
        int menu = 0;
        int opcao = 0;
        int qntXsalada = 0;
        int qntXburguer = 0;
        int qntSuco = 0;

        do {
            System.out.println("===LANCHONETE===");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Ver comanda");
            System.out.println("0 - Fechar e pagar");

            menu = scan.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Total a pagar: " + (qntXburguer * 18.50 + qntXsalada * 16.00 + qntSuco * 8.00));
                    System.out.println("Obrigado pela preferência!");

                    break;
                case 1:
                    System.out.println(" ");
                    System.out.println("===CARDÁPIO===");
                    System.out.println("1 - X-Burger (R$ 18.50)");
                    System.out.println("2 - X-Salada (R$ 16.00)");
                    System.out.println("3 - Suco Natural (R$ 8.00)");
                    opcao = scan.nextInt();
                    totalPedidos++;
                    if (totalPedidos > pedido.length) {
                        System.out.println("Limite de pedidos atingido!");
                        totalPedidos--;
                        break;
                    }
                    switch (opcao) {
                        case 1:
                            qntXburguer++;
                            pedido[totalPedidos - 1] = new Pedido("X-Burger", qntXburguer, 18.50);
                            System.out.println("Item: 1");
                            System.out.println("Quantidade: " + qntXburguer);
                            System.out.println("Adicionado!");
                            break;
                        case 2:
                            qntXsalada++;
                            pedido[totalPedidos - 1] = new Pedido("X-Salada", qntXsalada, 16.00);
                            System.out.println("Item: 2");
                            System.out.println("Quantidade: " + qntXsalada);
                            System.out.println("Adicionado!");
                            break;
                        case 3:
                            qntSuco++;
                            pedido[totalPedidos - 1] = new Pedido("Suco Natural", qntSuco, 8.00);
                            System.out.println("Item: 3");
                            System.out.println("Quantidade: " + qntSuco);
                            System.out.println("Adicionado!");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            totalPedidos--;
                            break;
                    }

                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("===COMANDA===");
                    for (int i = 0; i < totalPedidos; i++) {
                        System.out.println("Item: " + pedido[i].nomeItem + " x" + pedido[i].quantidade + " - R$ "
                                + pedido[i].calcularTotal(pedido[i].quantidade, pedido[i].precoUnitario));
                        ;
                        System.out.println("-------------------");

                    }
                    System.out.println(
                            "Total a pagar: R$ " + (qntXburguer * 18.50 + qntXsalada * 16.00 + qntSuco * 8.00));
                    break;
                default:
                    break;
            }

        } while (menu != 0);
        scan.close();

    }
}
