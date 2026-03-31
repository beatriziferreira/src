package unidade4;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scan.nextDouble() * 2;

        System.out.println("Insira a terceira nota: ");
        double nota3 = scan.nextDouble() * 3;

        System.out.println("Insira a nota dos exercícios: ");
        double notaExercicios = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + notaExercicios) / 7;

        if (media >= 9.0) {
            System.out.println("Média: " + String.format("%.2f", media) + " - Aprovado com conceito A.");
        } else if (media >= 7.5 && media < 9.0) {
        System.out.println("Média: " + String.format("%.2f", media) + " - Aprovado com conceito B.");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Média: " + String.format("%.2f", media) + " - Aprovado com conceito C.");
        } else if (media >= 4.0 && media < 6.0 ) {
            System.out.println("Média: " + String.format("%.2f", media) + " - Reprovado com conceito D.");
        } else {
            System.out.println("Média: " + String.format("%.2f", media) + " - Reprovado com conceito E.");
        }
       scan.close();
    }
}
