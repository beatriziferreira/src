package unidade4;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor de X: ");
        float x = scan.nextFloat();

        System.out.println("Insira o valor de Y: ");
        float y = scan.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("Os valores de X e Y estão no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("Os valores de X e Y estão no segundo quadrante.");  
        } else if (x < 0 && y < 0) {
            System.out.println("Os valores de X e Y estão no terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("Os valores de X e Y estão no quarto quadrante.");
        } else {
            System.out.println("Os valores de X e Y estão na origem ou em um dos eixos.");
        }
        scan.close();
    }
}
