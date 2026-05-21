package unidade6;

import java.util.Scanner;

public class Ex5Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] jogoDaVelha = new char[3][3];

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Jogar");
            System.out.println("2. Ver tabuleiro");
            System.out.println("3. Sair");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a linha (0-2): ");
                    int linha = scan.nextInt();
                    System.out.print("Digite a coluna (0-2): ");
                    int coluna = scan.nextInt();
                    System.out.print("Digite o símbolo (X/O): ");
                    char simbolo = scan.next().charAt(0);
                    simbolo = Character.toUpperCase(simbolo);

                    if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && (simbolo == 'X' || simbolo == 'O')) {
                        
                        if (jogoDaVelha[linha][coluna] != '\u0000') {
                            System.out.println("Posição já ocupada. Tente novamente.");
                            break;
                        }
                        else { jogoDaVelha[linha][coluna] = simbolo; }

                        if (verificarVitoria(jogoDaVelha, 'X')) {
                            System.out.println("Jogador X venceu!");
                        } else if (verificarVitoria(jogoDaVelha, 'O')) {
                            System.out.println("Jogador O venceu!");
                        } else if (verificarEmpate(jogoDaVelha)) {
                            System.out.println("Velha! O jogo empatou!");
                        }
                    } else {
                        System.out.println("Entrada inválida. Tente novamente.");
                    }
                    break;
                case 2:
                    System.out.println("Tabuleiro do Jogo da Velha:");
                    for (int i = 0; i < jogoDaVelha.length; i++) {
                        for (int j = 0; j < jogoDaVelha[i].length; j++) {
                            System.out.print(jogoDaVelha[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa. Obrigado por jogar!");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!verificarVitoria(jogoDaVelha, 'X') && !verificarVitoria(jogoDaVelha, 'O')
                && !verificarEmpate(jogoDaVelha));
        scan.close();
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
                return true;
            }
            if (tabuleiro[0][i] == simbolo && tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) {
                return true;
            }
        }
        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true;
        }
        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}
