package TrabalhoFinal;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        int fila = 0;
        int poltrona = 0;
        double preco = 0.0;
        String tipo = "";
        int contadorIngressos = 0;
        double totalVendas = 0.0;
        int assentosOcupados = 15;
        Sala sala = new Sala();
        System.out.println("===Bem-vindo ao CineCampus!===");

        do {
            System.out.println(" ");
            System.out.println("---Menu de opções---");
            System.out.println("[1]. Exibir assentos disponíveis");
            System.out.println("[2]. Comprar ingresso");
            System.out.println("[3]. Ver resumos de venda");
            System.out.println("[0]. Sair");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" ");
                    sala.exibirAssentos();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    sala.exibirAssentos();
                    System.out.println(" ");

                    System.out.println("Informe a fila do assento (0-9): ");
                    fila = scan.nextInt();
                    if (fila < 0 || fila > 9) {
                        do {
                            System.out.println("Fila inválida! Tente novamente!");
                            fila = scan.nextInt();
                        } while (fila < 0 || fila > 9);
                    }
                    System.out.println("Informe a poltrona (0-9): ");
                    poltrona = scan.nextInt();
                    if (poltrona < 0 || poltrona > 9) {
                        do {
                            System.out.println("Poltrona inválida! Tente novamente!");
                            poltrona = scan.nextInt();
                        } while (poltrona < 0 || poltrona > 9);

                    }

                    if (sala.verificarAssento(fila, poltrona)) {
                        do{
                        System.out.println("Assento já ocupado. Por favor, tente novamente.");
                        System.out.println("Informe a fila do assento (0-9): ");
                        fila = scan.nextInt();
                        if (fila < 0 || fila > 9) {
                            do {
                            System.out.println("Fila inválida! Tente novamente!");
                            fila = scan.nextInt();
                        } while (fila < 0 || fila > 9);
                        }

                        System.out.println("Informe a poltrona (0-9): ");
                        poltrona = scan.nextInt();
                        if (poltrona < 0 || poltrona > 9) {
                          do {
                            System.out.println("Poltrona inválida! Tente novamente!");
                            poltrona = scan.nextInt();
                        } while (poltrona < 0 || poltrona > 9);
                        }
                    } while (sala.verificarAssento(fila,poltrona));

                    }

                    System.out.println("Informe o tipo de ingresso: ");
                    tipo = scan.next();
                    System.out.println(" ");
                    Ingresso ingresso = new Ingresso(fila, poltrona, tipo, preco);
                    ingresso.comprar(scan);

                    System.out.println("Fila: " + fila + " - Poltrona: " + poltrona);
                    System.out.println("Tipo: " + ingresso.tipo);
                    System.err.println("Confirma a compra? (S/N)");
                    String confirmacao = scan.next();

                    if (confirmacao.equalsIgnoreCase("S")) {
                        totalVendas += ingresso.preco;
                        contadorIngressos++;
                        assentosOcupados++;
                        sala.assentos[fila][poltrona] = true;
                        System.out.println("Ingresso comprado com sucesso!");
                        System.out.println(" ");
                    } else if (confirmacao.equalsIgnoreCase("N")) {
                        sala.assentos[fila][poltrona] = false;
                        System.out.println("Compra cancelada.");
                        System.out.println(" ");
                    }

                    break;
                case 3:
                    System.out.println("===Resumo de vendas===");
                    System.out.println("Total de ingressos vendidos: " + contadorIngressos);
                    System.out.println("Bilheteria: R$ " + String.format("%.2f", totalVendas));
                    System.out.println("Percentual de ocupação: " + assentosOcupados + "%");
                    break;
                case 0:
                    System.out.println("===Resumo final===");
                    System.out.println(" ");
                    sala.exibirAssentos();
                    System.out.println(" ");
                    System.out.println("Total de ingressos vendidos: " + contadorIngressos);
                    System.out.println("Bilheteria: R$ " + String.format("%.2f", totalVendas));
                    System.out.println("Percentual de ocupação: " + assentosOcupados + "%");

                    if (assentosOcupados >= 90) {
                        System.out.println("Sessão Esgotada — Sucesso de Bilheteria!");
                    } else if (assentosOcupados >= 70 && assentosOcupados <= 89) {
                        System.out.println("Casa cheia!");
                    } else if (assentosOcupados >= 40 && assentosOcupados <= 69) {
                        System.out.println("Sessão Mediana");
                    } else {
                        System.out.println("Sala Vazia - precisa divulgar mais!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0 && assentosOcupados != 100);
        scan.close();
    }
}
