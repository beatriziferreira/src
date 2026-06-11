package TrabalhoFinal;

public class Sala {
    int numeroSala;
    boolean[][] assentos;

    public Sala(int numeroSala) {
        this.numeroSala = numeroSala;
        this.assentos = new boolean[4][6];
    }

    public void exibirAssentos() {
        System.out.println("Assentos disponíveis na sala " + numeroSala + ":");
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                if (assentos[i][j]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }

        }
    }
}