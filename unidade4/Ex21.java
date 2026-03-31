package unidade4;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Insira a sua massa corporal: ");
        double massa = scan.nextDouble();
       
        System.out.println("Insira a sua altura: ");
        double altura = scan.nextDouble();
        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Magreza.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Saudável.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Obesidade grau I.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Obesidade grau II (Severa).");
        } else {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Obesidade grau III.");
        }
        scan.close();
    }
}
