package unidade4;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        System.out.println("T - Calcula a área de um triângulo");
        System.out.println("Q - Calcula a área de um quadrado de lado l");
        System.out.println("R - Calcula a área de um retângulo de base b e altura h");
        System.out.println("C - Calcula a área de um círculo de raio r");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escolha uma opção acima: ");
        char opção = scan.next().charAt(0);

        switch (opção) {
            case 'T':
                System.out.println("Insira a altura do triângulo: ");
                double altura = scan.nextDouble();
                
                System.out.println("Insira a base: ");
                double base = scan.nextDouble();

                double area = altura * base / 2;
                System.out.println(area);
                break;
        
            case 'Q':
                System.out.println("Insira o lado do quadrado: ");
                double lado = scan.nextDouble();
                double areaq = lado * lado;
                System.out.println(areaq);
                break;

            case 'R':
                System.out.println("Insira a altura do retângulo: ");
                double alturaR = scan.nextDouble();
                
                System.out.println("Insira a base: ");
                double baseR = scan.nextDouble();

                double areaR = alturaR * baseR;
                System.out.println(areaR);
                break;
            case 'C':
                System.out.println("Insira o raio do círculo: ");
                double raio = scan.nextDouble();

                double areaC = raio * raio * 3.1415926;
                System.out.println(String.format("%.2f", areaC));
                break;

        } scan.close();
    }
}
