package unidade4;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a idade da mulher mais nova: ");
        int idadeMulherNova = scan.nextInt();

        System.out.println("Insira a idade da mulher mais velha: ");
        int idadeMulherVelha = scan.nextInt();

        System.out.println("Insira a idade do homem mais novo: ");
        int idadeHomemNovo = scan.nextInt();

        System.out.println("Insira a idade do homem mais velho: ");
        int idadeHomemVelho = scan.nextInt();

        if (idadeMulherNova < idadeMulherVelha && idadeHomemNovo < idadeHomemVelho) {
            int produto = idadeMulherVelha * idadeHomemNovo;
            int soma = idadeMulherNova + idadeHomemVelho;
            System.out.println("Produto: " + produto);
            System.out.println("Soma: " + soma);
        } else {
            System.out.println("As idades inseridas não estão em ordem correta.");
        }

        scan.close();
    }
}
