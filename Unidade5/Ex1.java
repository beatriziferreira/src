package Unidade5;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }

        scan.close();
    }
}