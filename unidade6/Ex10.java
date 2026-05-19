package unidade6;

import java.util.Scanner;

public class Ex10 {

    static final int CAPACIDADE = 50;
    static int[] vetor = new int[CAPACIDADE];
    static int tamanho = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor(sc);
                    break;

                case 2:
                    pesquisarValor(sc);
                    break;

                case 3:
                    alterarValor(sc);
                    break;

                case 4:
                    excluirValor(sc);
                    break;

                case 5:
                    mostrarValores();
                    break;

                case 6:
                    ordenarValores();
                    break;

                case 7:
                    inverterValores();
                    break;

                case 8:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 8);

        sc.close();
    }

   
    public static void incluirValor(Scanner sc) {

        if (tamanho < CAPACIDADE) {
            System.out.print("Digite o valor: ");
            int valor = sc.nextInt();

            vetor[tamanho] = valor;
            tamanho++;

            System.out.println("Valor incluído com sucesso!");
        } else {
            System.out.println("Vetor cheio! Não é possível incluir.");
        }
    }

    
    public static void pesquisarValor(Scanner sc) {

        System.out.print("Digite o valor a pesquisar: ");
        int valor = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado no vetor.");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static void alterarValor(Scanner sc) {

        System.out.print("Digite o número a ser alterado: ");
        int valorAntigo = sc.nextInt();

        System.out.print("Digite o novo número: ");
        int novoValor = sc.nextInt();

        boolean alterado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorAntigo) {
                vetor[i] = novoValor;
                alterado = true;
                break;
            }
        }

        if (alterado) {
            System.out.println("Valor alterado com sucesso!");
        } else {
            System.out.println("Número não encontrado.");
        }
    }


    public static void excluirValor(Scanner sc) {

        System.out.print("Digite o valor a excluir: ");
        int valor = sc.nextInt();

        int posicao = -1;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {

           
            for (int i = posicao; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }

            tamanho--;

            System.out.println("Valor excluído com sucesso!");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }


    public static void mostrarValores() {

        if (tamanho == 0) {
            System.out.println("Vetor vazio.");
        } else {
            System.out.println("Valores do vetor:");

            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }

            System.out.println();
        }
    }


    public static void ordenarValores() {

        for (int i = 0; i < tamanho - 1; i++) {

            for (int j = 0; j < tamanho - 1 - i; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Valores ordenados em ordem crescente.");
    }

    public static void inverterValores() {

        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {

            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("Valores invertidos com sucesso!");
    }
}