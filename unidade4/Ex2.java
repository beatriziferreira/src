package unidade4;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Digite um número maior que 0: ");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        scan.close();
        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!"); 
        }
    }
}