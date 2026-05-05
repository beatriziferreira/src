package Unidade5;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Insira a quantidade de reabastecimentos: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double soma = 0;
        int paradas = 0;
        double kilometragem, litros = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a kilometragem da parada: ");
            kilometragem = sc.nextDouble();
            System.out.println("Digite a quantidade de litros abastecidos: ");
            litros = sc.nextDouble();
            paradas ++;
            kilometragem += kilometragem;
            litros += litros;
            double consumo = kilometragem / litros;
            soma += consumo;
            System.out.println("Parada " + i + ": " + String.format("%.2f", consumo) + " km/l");
        }
        double mediaConsumo = soma / paradas;
        System.out.println("A média de consumo do veículo é: " + String.format("%.2f", mediaConsumo) + " km/l");

        sc.close();

    }
}
