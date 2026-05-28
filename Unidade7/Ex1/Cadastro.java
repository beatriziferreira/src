package Unidade7.Ex1;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            scanner.nextLine();

            Aluno aluno = new Aluno(nome, nota);
            alunos[i] = aluno;

        }
        
        System.out.println("\n===CADASTRO DE ALUNOS===");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i].nome + " - Nota: " + alunos[i].nota);
        }

        System.out.println("\n===RESULTADO===");
        for (int i = 0; i < alunos.length; i++) {
            alunos[i].situacao();
        }
        scanner.close();

    }
}