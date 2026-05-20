package unidade6;

public class Matriz3d {
public static void main(String[] args) {
        int[][][] matriz = new int[3][3][5];
        matriz[0][0][0] = 1;
        matriz[0][0][1] = 2;
        matriz[0][0][2] = 3;
        matriz[0][0][3] = 4;
        matriz[0][0][4] = 5;

        matriz[1][0][0] = 6;
        matriz[1][0][1] = 7;
        matriz[1][0][2] = 8;
        matriz[1][0][3] = 9;
        matriz[1][0][4] = 10;

        matriz[2][0][0] = 11;
        matriz[2][0][1] = 12;
        matriz[2][0][2] = 13;
        matriz[2][0][3] = 14;
        matriz[2][0][4] = 15;

        for (int profundidade = 0; profundidade < matriz.length; profundidade++) {
            for (int linha = 0; linha < matriz[profundidade].length; linha++) {
                for (int coluna = 0; coluna < matriz[profundidade][linha].length; coluna++) {
                    System.out.print(matriz[profundidade][linha][coluna] + " ");
                }
                System.out.println();
            }
        }

        int[][][][] matriz2 = new int[3][3][3][3];
        matriz2[0][0][0][0] = 1;
        matriz2[0][0][0][1] = 2;
        matriz2[0][0][0][2] = 3;
        matriz2[0][0][1][0] = 4;
        matriz2[0][0][1][1] = 5;
        matriz2[0][0][1][2] = 6;
        matriz2[0][0][2][0] = 7;

        for (int profundidade1 = 0; profundidade1 < matriz2.length; profundidade1++) {
            for (int profundidade2 = 0; profundidade2 < matriz2[profundidade1].length; profundidade2++) {
                for (int linha = 0; linha < matriz2[profundidade1][profundidade2].length; linha++) {
                    for (int coluna = 0; coluna < matriz2[profundidade1][profundidade2][linha].length; coluna++) {
                        System.out.print(matriz2[profundidade1][profundidade2][linha][coluna] + " ");
                    }
                    System.out.println();
                }
            }
        }
        

        

    } 
    
}
