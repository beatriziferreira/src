package unidade4;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira outro número: ");
        int num2 = scan.nextInt();

        if (num1 > num2 && num1 % num2 == 0) {
            System.out.println("São múltiplos!");
        } else if (num2 > num1 && num2 % num1 == 0){
            System.out.println("São múltiplos!");
        } else if (num1 == num2) {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são múltiplos!");
        }
        scan.close();
    }
}
