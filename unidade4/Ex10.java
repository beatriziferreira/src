package unidade4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("insira a idade do Marquinhos: ");
        int marquinhos = scan.nextInt();

        System.out.println("insira a idade da Luluzinha: ");
        int luluzinha = scan.nextInt();

        System.out.println("insira a idade do Zezinho: ");
        int zezinho = scan.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("Marquinhos é o caçula!");
        } else if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("Zezinho é o caçula!");
        } else if (luluzinha < zezinho && luluzinha < marquinhos) {
            System.out.println("Luluzinha é a caçula!");
        }
        scan.close();
    } 
}
