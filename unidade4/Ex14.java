package unidade4;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Insira o dia: ");
        int dia = scan.nextInt();

        System.out.println("Insira o mês: ");
        int mes = scan.nextInt();

        System.out.println("Insira o ano: ");
        int ano = scan.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (dia > 0 && dia <= 32 && mes > 0 && mes <= 12) {
            if (mes == 2) {
                if (bissexto && dia <= 29) {
                    System.out.println("Data válida.");
                } else if (!bissexto && dia <= 28) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else {
                if (dia <= 31) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            }
        } else {
            System.out.println("Data inválida.");
        }
        scan.close();

    }
}
