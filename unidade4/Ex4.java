package unidade4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Digite um número maior que 0: ");
        Scanner scan = new Scanner (System.in);
        float num = scan.nextFloat();
        if (num == (int) num) {
            System.out.println("Não foram digitadas casas decimais");
        } else {
            System.out.println("Foram digitadas as casas decimais");
        }
        scan.close();
    }
}
