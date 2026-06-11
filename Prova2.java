import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de alunos desejada(máx. 50): ");
        int n = scan.nextInt();
        String[] alunos = new String[n];
        double[][] pesos = new double[n][3];

        if (n > 50) {
            System.out.println("Número máximo ultrapassado, insira outro valor: ");
            n = scan.nextInt();
        }

        System.out.println("Quantidade de alunos: " + n);

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome do aluno [ " + (i + 1) + " ]:");
            alunos[i] = scan.next();

            System.out.println("Insira o peso do aluno [ " + (i + 1) + " ] " + "no mês 1: ");
            pesos[i][0] = scan.nextDouble();

            System.out.println("Insira o peso do aluno [ " + (i + 1) + " ] " + "no mês 2: ");
            pesos[i][1] = scan.nextDouble();

            System.out.println("Insira o peso do aluno [ " + (i + 1) + " ] " + "no mês 3: ");
            pesos[i][2] = scan.nextDouble();

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Aluno " + (i + 1) + " - " + alunos[i]);
            System.out.println("Peso no mês 1: " + pesos[i][0]);
            System.out.println("Peso no mês 2: " + pesos[i][1]);
            System.out.println("Peso no mês 3: " + pesos[i][2]);
            System.out.println(" ");

        }

        System.out.println("---Resultados---");

        for (int i = 0; i < n; i++) {
            double somaNotasAluno = 0;
            for (int j = 0; j < 3; j++) {
                somaNotasAluno += pesos[i][j];
            }
            double mediaAluno = somaNotasAluno / 3;
            System.out.println("Média de " + alunos[i] + ": " + String.format("%.2f", mediaAluno));
        }

        String alunoPerdeuPeso = " ";

        for (int i = 0; i < n; i++) {
            if (pesos[i][2] < pesos[i][0]) {
                alunoPerdeuPeso += alunos[i] + ", ";
            }
        }

        double menorPeso = pesos[0][0];
        double maiorPeso = pesos[0][0];
        String alunoMaiorPeso = " ";
        String alunoMenorPeso = " ";
        int mesMaiorPeso = 0;
        int mesMenorPeso = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (pesos[i][j] > maiorPeso) {
                    maiorPeso = pesos[i][j];
                    alunoMaiorPeso = alunos[i];
                    mesMaiorPeso = j + 1;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (pesos[i][j] < menorPeso) {
                    menorPeso = pesos[i][j];
                    alunoMenorPeso = alunos[i];
                    mesMenorPeso = j + 1;
                }
            }
        }

        System.out.println(" ");

        System.out.println("Maior peso: " + maiorPeso + " (" + alunoMaiorPeso + ", mês " + mesMaiorPeso + ")");
        System.out.println("Menor peso: " + menorPeso + " (" + alunoMenorPeso + ", mês " + mesMenorPeso + ")");

        System.out.println(" ");

        System.out.println("Alunos que perderam peso:" + alunoPerdeuPeso);

        scan.close();
    }
}
