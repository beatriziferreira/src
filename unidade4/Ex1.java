package unidade4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Insira quantas horas você trabalha por mês: ");
        Scanner scan = new Scanner (System.in);
        int horas = scan.nextInt();
        System.out.println("Insira o valor por hora: ");
        double valor = scan.nextDouble();
        double salario = valor * horas;
        if (horas > 160) {
            double salarioBonus = (horas - 160) * (valor / 2);
            double salarioFinal = salario + salarioBonus;
            System.out.println("seu salário com bônus é de: " + salarioFinal);
        } else {
            System.out.println("seu salário total é de: "+ salario);
        }
        scan.close();
    }
}
