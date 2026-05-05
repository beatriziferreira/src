package Unidade5;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massaInicial = 0;
        double massaFinal = 0;
        double tempo = 0;

        System.out.print("Digite a massa inicial do material radioativo (em gramas): ");
        massaInicial = sc.nextDouble();

        while (massaInicial > 0) {
            massaFinal = massaInicial;
            tempo = 0;

            while (massaFinal >= 0.5) {
                massaFinal /= 2;
                tempo += 50;
            }
            System.out.println("Massa inicial: " + massaInicial + " gramas");
            System.out.println("Massa final: " + massaFinal + " gramas");
            System.out.println("Tempo necessário para a massa atingir 0,5 gramas: " + tempo + " segundos");
            
            System.out.print("Digite a massa inicial do material radioativo (em gramas) ou 0 para encerrar: ");
            massaInicial = sc.nextDouble();
        }
        sc.close();
    }
}
