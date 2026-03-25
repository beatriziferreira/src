package unidade4;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe a idade de um irmão: ");
        int irm1 = scan.nextInt();

        System.out.println("informe a idade do outro irmão: ");
        int irm2 = scan.nextInt();

        System.out.println("informe a idade do último irmão: ");
        int irm3 = scan.nextInt();

        if (irm1 == irm2 && irm1 == irm3) {
            System.out.println("trigêmeos!");
        } else if (irm1 != irm2 && irm1 == irm3) { 
            System.out.println("gêmeos!");
        } else if (irm1 == irm2 && irm1 != irm3) { 
            System.out.println("gêmeos!");
        } else if (irm1 != irm2 && irm1 != irm3 && irm2 == irm3) {
            System.out.println("gêmeos!");
        } else {
            System.out.println("Apenas irmãos!");
        }
        scan.close();

    } 
}
