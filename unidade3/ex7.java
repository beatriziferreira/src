package unidade3;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        System.out.println("Informe quantas latas de 350 ml deseja: ");
        Scanner teclado = new Scanner (System.in);
        int quantLatas = teclado.nextInt();
        System.out.println("Informe quantas garrafas de 600 ml deseja: ");
        int quantGarrafas1 = teclado.nextInt();
        System.out.println("Informe quantas garrafas de 2L deseja: ");
        int quantGarrafas2 = teclado.nextInt();
        int latas = 350;
        int garrafas1 = 600;
        int garrafas2 = 2000;
        double litros = (quantLatas * latas  + quantGarrafas1 * garrafas1 + quantGarrafas2 * garrafas2) / 1000;
        System.out.println("Litros totais: " + litros);
        teclado.close();

    }
}
