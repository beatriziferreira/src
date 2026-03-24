package unidade4;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner scan = new Scanner (System.in);
        String nome = scan.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Informe sua senha: ");
        int senha = scan.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é de menor!");
        }
        if (senha != 1234) {
            System.out.println("Senha incorreta!");
        }
        if (!nome.equals("Beatriz")) {
            System.out.println("Você não é a Beatriz");
        } else {
            System.out.println("Você é a Beatriz!");
        }
        scan.close();
    }
}
