package unidade4;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("A cor é azul? (true or false) ");
        Scanner scan = new Scanner (System.in);
        boolean cor = scan.nextBoolean();
        if (cor){
            System.out.println("A cor é azul!");
        } else {
            System.out.println("A cor não é azul");
        }
        scan.close();
            
    }
}
