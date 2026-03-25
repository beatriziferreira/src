package unidade4;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um lado do triângulo: ");
        double lado = scan.nextDouble();

        System.out.println("Insira o outro lado: ");
        double lado2 = scan.nextDouble();

        System.out.println("Insira o último lado: ");
        double lado3 = scan.nextDouble();

        if (lado < lado2 + lado3 && lado2 < lado + lado3 && lado3 < lado + lado2 ){
            System.out.println("É um triângulo");
            if (lado == lado2 && lado == lado3){
                System.out.println("Equilátero!");
            } else if (lado != lado2 && lado == lado3){
                System.out.println("Isósceles!");
            } else if (lado == lado2 && lado != lado3) {
                System.out.println("Isósceles!");
            } else if (lado != lado2 && lado != lado3 && lado2 == lado3) {
                System.out.println("Isósceles!");
            } else {
                System.out.println("Escaleno!");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
        scan.close();
    }
}
