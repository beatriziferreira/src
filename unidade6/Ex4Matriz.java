package unidade6;

import java.util.Scanner;

public class Ex4Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número de departamentos : ");
        int numDepartamentos = scan.nextInt();

        System.out.print("Digite o número de funcionários por departamento: ");
        int numFuncionarios = scan.nextInt();

        int [][] matriz = new int[numDepartamentos][numFuncionarios];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o salário do funcionário [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        double mediaSalariosDepartamento = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            double somaSalariosDepartamento = 0;
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                somaSalariosDepartamento += matriz[linha][coluna];
            }
            mediaSalariosDepartamento = somaSalariosDepartamento / matriz[linha].length;
            System.out.println("Média salarial do departamento " + (linha + 1) + ": RS " + String.format("%.2f", mediaSalariosDepartamento));
        }

        double mediaSalariosEmpresa = 0;
        double somaSalariosEmpresa = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                somaSalariosEmpresa += matriz[linha][coluna];
            }
        }
        mediaSalariosEmpresa = somaSalariosEmpresa / (matriz.length * matriz[0].length);
        System.out.println("Média salarial da empresa: RS " + String.format("%.2f", mediaSalariosEmpresa));

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] > mediaSalariosEmpresa) {
                    System.out.println("Funcionário [" + (linha + 1) + "][" + (coluna + 1) + "] tem salário acima da média da empresa: RS " + String.format("%.2f", matriz[linha][coluna]));
                }
            }
        }

        double maiorSalario = matriz[0][0];
        int linhaMaiorSalario = 0;
        int colunaMaiorSalario = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] > maiorSalario) {
                    maiorSalario = matriz[linha][coluna];
                    linhaMaiorSalario = linha;
                    colunaMaiorSalario = coluna;
                }
            }
        }
        System.out.println("Maior salário da empresa: RS " + String.format("%.2f", maiorSalario) + " encontrado no funcionário [" + (linhaMaiorSalario + 1) + "][" + (colunaMaiorSalario + 1) + "]");
        scan.close();
    }
}

