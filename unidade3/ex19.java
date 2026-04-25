package unidade3;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        System.out.println("Informe seu salário: ");
        Scanner teclado = new Scanner (System.in);
        double salario = teclado.nextDouble();

        System.out.println("Informe quantos meses trabalhou: ");
        int meses = teclado.nextInt();

        
        double decTerc = (salario / 12) * meses;

        System.out.println("O valor do seu décimo terceiro é de: " + decTerc + " RS");
        teclado.close();
    }
    
}
