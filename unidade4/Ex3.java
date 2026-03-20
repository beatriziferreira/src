package unidade4;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Digíte um número: ");
        Scanner scan =  new Scanner (System.in);
        int num1 = scan.nextInt();
        System.out.println("Digíte outro número: ");
        int num2 = scan.nextInt();
        scan.close();
        if (num1 > num2) {
            System.out.println(num1 + " é maior");
        } else {
            System.out.println(num2 + " é maior");
        }
    }
}
