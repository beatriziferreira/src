package unidade4;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        System.out.println("Insira quantos meses está admitido: ");
        Scanner scan = new Scanner(System.in);
        int meses = scan.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionário receberá 5% de reajuste.");
        } else if (meses >= 13 && meses < 48) {
            System.out.println("O funcionário receberá 15% de reajuste.");
        } else {
            System.out.println("Reajuste não aplicável.");
        }
        scan.close();
    }
}

