package Unidade7.Jogo;

public class Jogador {
    String nome;
    int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public boolean eDestaque() {
        if (pontuacao >= 1000) {
            return true;
        } else {
            return false;
        }
    }

    void exibirInfo(int posicao) {

        String asterisco = "";
        if (eDestaque()) {
            asterisco = "*";
        }

        System.out.println("Posição(1-5): " + posicao);
        System.out.println("Jogador: " + nome + asterisco);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("-----------------------");
        System.out.println("");
        
       
    }

}
