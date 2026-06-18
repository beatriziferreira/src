package TrabalhoFinal;

import java.util.Scanner;

public class Sala {
    Scanner scan = new Scanner(System.in);
    boolean[][] assentos = new boolean[10][10];

    public Sala() {
        this.assentos[0][0] = true;
        this.assentos[1][1] = true;
        this.assentos[0][4] = true;
        this.assentos[2][3] = true;
        this.assentos[3][5] = true;
        this.assentos[4][2] = true;
        this.assentos[5][6] = true;
        this.assentos[6][7] = true;
        this.assentos[9][9] = true;
        this.assentos[8][8] = true;
        this.assentos[5][7] = true;
        this.assentos[7][3] = true;
        this.assentos[1][8] = true;
        this.assentos[2][2] = true;
        this.assentos[4][9] = true;
    }

    

    public void exibirAssentos() {
        System.out.println("Mapa da sessão:");
        System.out.print("   0  1  2  3  4  5  6  7  8  9");
        System.out.println();
        for (int i = 0; i < assentos.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < assentos[i].length; j++) {
                if (assentos[i][j]) {
                    System.out.print(" # ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public boolean verificarAssento(int fila, int poltrona) {
        if (fila < 0 || fila > 9)  {
            return false; // Assento inválido
        }
        if (poltrona < 0 || poltrona > 9)  {
            return false; // Assento inválido
        }
        if (assentos[fila][poltrona]) {
            return true; // Assento já ocupado
        } else {
            assentos[fila][poltrona] = true; // Reservar o assento
            return false; // Reserva bem-sucedida
        }
    }

}