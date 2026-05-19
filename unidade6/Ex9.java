package unidade6;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sexo = new int[30];
        int[] nota = new int[30];
        int[] idade = new int[30];
        int contadorHomens = 0;
        int somaNotasHomens = 0;
        int somaTotal = 0;
        int notasMulheresMais50 = 0;

        for (int i = 0; i < sexo.length; i++) {
            System.out.println("Escreva o sexo [ 1 - Masculino / 2 - Feminino ]: ");
            sexo[i] = scan.nextInt();

            System.out.println("Escreva a nota (1 a 10): ");
            nota[i] = scan.nextInt();

            if (nota[i] < 1 || nota[i] > 10) {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 1 e 10: ");
                scan.nextLine();
                nota[i] = scan.nextInt();
            }

            System.out.println("Escreva a idade: ");

            idade[i] = scan.nextInt();
            System.out.println("------------");

            somaTotal += nota[i];

            if (sexo[i] == 1) {
                contadorHomens++;
                somaNotasHomens += nota[i];
            }

        }

        int mulherMaisNova = Integer.MAX_VALUE;
        int notaMulherMaisNova = Integer.MAX_VALUE;
        double media = somaTotal / 30.0;

        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2 && idade[i] > 50 && nota[i] >= media) {
                notasMulheresMais50++;
            }
            if (sexo[i] == 2 && idade[i] < mulherMaisNova) {
                notaMulherMaisNova = nota[i];
                mulherMaisNova = idade[i];

            }
        }

        System.out.println("Média das notas do cinema: " + String.format("%.1f", media));

        if (contadorHomens > 0) {
            System.out.println(
                    "Média das notas dos homens: " + String.format("%.1f", (double) somaNotasHomens / contadorHomens));
        } else {
            System.out.println("Não há homens registrados.");
        }

        System.out.println(
                "Quantidade de mulheres com mais de 50 anos e nota maior ou igual à média: " + notasMulheresMais50);
        System.out.println("Nota da mulher mais nova: " + notaMulherMaisNova);
        scan.close();
    }
}
