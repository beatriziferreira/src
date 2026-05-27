package Unidade7.Jogo;

public class Ranking {
    Jogador[] jogadores;

    public Ranking() {
        jogadores = new Jogador[5];
    }

    public void registrar(int posicao, String nome, int pontuacao) {
        if (posicao >= 1 && posicao <= 5) {
            Jogador jogador = new Jogador(nome, pontuacao);
            jogadores[posicao - 1] = jogador;
        } else {
            System.out.println("Posição inválida. Use um número entre 1 e 5.");
        }

    }

    public void exibirRanking() {
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                jogadores[i].exibirInfo(i + 1);
            } else {
                System.out.println("=== Vazio ===");
            }
        }
    }
}
