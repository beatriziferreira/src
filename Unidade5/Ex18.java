package Unidade5;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int canal;
        int pessoas;

        int totalPessoas = 0;

        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;

        System.out.println("Digite o canal (0 para encerrar): ");
        canal = sc.nextInt();

        while (canal != 0) {
            System.out.println("Digite o número de pessoas assistindo: ");
            pessoas = sc.nextInt();

            if (canal == 4) {
                canal4 += pessoas;
            } else if (canal == 5) {
                canal5 += pessoas;
            } else if (canal == 9) {
                canal9 += pessoas;
            } else if (canal == 12) {
                canal12 += pessoas;
            }

            totalPessoas += pessoas;

            System.out.println("Digite o canal (0 para encerrar): ");
            canal = sc.nextInt();
        }

        if (totalPessoas > 0) {
            double perc4 = (canal4 * 100.0) / totalPessoas;
            double perc5 = (canal5 * 100.0) / totalPessoas;
            double perc9 = (canal9 * 100.0) / totalPessoas;
            double perc12 = (canal12 * 100.0) / totalPessoas;

            System.out.println("Percentual Canal 4: " + perc4 + "%");
            System.out.println("Percentual Canal 5: " + perc5 + "%");
            System.out.println("Percentual Canal 9: " + perc9 + "%");
            System.out.println("Percentual Canal 12: " + perc12 + "%");
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

        sc.close();
    }
}

