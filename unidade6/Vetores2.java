package unidade6;

import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        System.out.println("Insira a quantidade de alunos: ");
        Scanner scan = new Scanner(System.in);
        int qtdAlunos = scan.nextInt();
        double media = 0;
        double soma = 0;

        String[] nomes = new String[qtdAlunos];
        double[] notas = new double[qtdAlunos];

        for (int i = 0 ; i < qtdAlunos ; i++) {
            System.out.println("Insira o nome do aluno [ " + i + " ]: ");
            nomes[i] = scan.next();

            System.out.println("Insira a nota do aluno [ " + i + " ]: ");
            notas[i] = scan.nextDouble();
            soma += notas[i];

            
        }
            
        for (int i = 0 ; i < qtdAlunos; i++){
            if (notas[i] > 6.0) {
                System.out.println("O aluno" + " " + nomes[i] + " " + "foi aprovado(a)!");
            } else {
                System.out.println("O aluno" + " " + nomes[i] + " " + "foi reprovado(a)!");
            } 
            
        } 
        media = soma / qtdAlunos;
        System.out.println("Média geral da turma: " + media);
        
        scan.close();
        
        }
      

    }

