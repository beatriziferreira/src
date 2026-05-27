package Unidade7.Jogo;
import java.util.Scanner;

public class JogoInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ranking ranking = new Ranking();
        int menu = 0;
        do {
            System.out.println("=== Menu ===");
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Registrar jogador");
            System.out.println("2 - Exibir ranking");
            System.out.println("0 - Sair");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe a posição (1-5):");
                    int posicao = scan.nextInt();
                    System.out.println("Informe o nome do jogador:");
                    String nome = scan.next();
                    System.out.println("Informe a pontuação do jogador:");
                    int pontuacao = scan.nextInt();
                   
                    ranking.registrar(posicao, nome, pontuacao);
                    break;
                case 2:
                    ranking.exibirRanking();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (menu !=0);
        scan.close();
    }
}
