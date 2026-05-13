package unidade6;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        System.out.println("Insira a quantidade de alunos: ");
        Scanner scan = new Scanner(System.in);
        int qtdAlunos = scan.nextInt();
        double media = 0;
        double soma = 0;

        String[] nomes = new String[qtdAlunos];
        double[] notas = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Insira o nome do aluno [ " + i + " ]: ");
            nomes[i] = scan.next();

            System.out.println("Insira a nota do aluno [ " + i + " ]: ");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }

        for (int i = 0; i < qtdAlunos; i++) {
            if (notas[i] > 6.0) {
                System.out.println("O aluno" + " " + nomes[i] + " " + "foi aprovado(a)!");
            } else {
                System.out.println("O aluno" + " " + nomes[i] + " " + "foi reprovado(a)!");
            }
        }
        media = soma / qtdAlunos;
        System.out.println("Média geral da turma: " + String.format("%.1f", media));

        double maior = notas[0]; // Pode usar Double.MIN_VALUE
        double menor = notas[0]; // Pode usar Double.MAX_VALUE

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        System.out.println("Deseja ordenar as notas? (s/n) ");
        char resposta = scan.next().charAt(0);

        while (resposta == 's') {

            System.out.println("Escolha uma opção");
            System.out.println("C - Ordem Crescente");
            System.out.println("D - Ordem Decrescente");

            char opcao = scan.next().charAt(0);

            switch (opcao) {

                case 'D':
                    for (int i = 0; i < notas.length - 1; i++) {
                        for (int j = 0; j < notas.length - 1 - i; j++) {
                            // ordenação decrescente
                            if (notas[j] < notas[j + 1]) {
                                double troca = notas[j];
                                notas[j] = notas[j + 1];
                                notas[j + 1] = troca;
                            }
                        }
                    }

                    System.out.println("Notas ordenadas de forma decrescente: ");

                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Nota [" + i + "] " + notas[i]);
                    }
                    break;

                case 'C':
                    for (int i = 0; i < notas.length - 1; i++) {
                        for (int j = 0; j < notas.length - 1 - i; j++) {
                            // ordenação crescente
                            if (notas[j] > notas[j + 1]) {
                                double troca = notas[j];
                                notas[j] = notas[j + 1];
                                notas[j + 1] = troca;
                            }
                        }
                    }

                    System.out.println("Notas ordenadas de forma crescente: ");

                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Nota [" + i + "] " + notas[i]);
                    }
                    break;
            }
            System.out.println("Deseja ordenar novamente? (s/n) ");
            resposta = scan.next().charAt(0);

        }
        scan.close();

    }

}
