package unidade6;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;

        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;

        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = sc.nextInt();

        System.out.print("Informe a quantidade de notas por aluno: ");
        int quantidadeNotas = sc.nextInt();

        int[][] notas = new int[quantidadeAlunos][quantidadeNotas];

        for (int aluno = 0; aluno < notas.length; aluno++) {
            for (int nota = 0; nota < notas[aluno].length; nota++) {
                System.out.print("Informe a nota do aluno " + (aluno + 1) + " para a prova " + (nota + 1) + ": ");
                notas[aluno][nota] = sc.nextInt();
            }
        }

        for (int aluno = 0; aluno < notas.length; aluno++) {
            for (int nota = 0; nota < notas[aluno].length; nota++) {
                System.out.print(notas[aluno][nota] + " ");
            }
            System.out.println();
        }

        int somaNotas = 0;
        for (int aluno = 0; aluno < notas.length; aluno++) {
            int somaNotasAluno = 0;
            for (int nota = 0; nota < notas[aluno].length; nota++) {
                somaNotasAluno += notas[aluno][nota];
            }
            int mediaAluno = somaNotasAluno / quantidadeNotas;
            System.out.println("Média do aluno " + (aluno + 1) + ": " + mediaAluno);
            somaNotas += somaNotasAluno;
        }
        int mediaTurma = somaNotas / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Média da turma: " + mediaTurma);
        sc.close();

    }
}
