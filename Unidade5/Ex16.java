package Unidade5;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char genero;
        double alturaTotal = 0;
        double somaAlturaFeminina = 0;
        int contadorFeminino = 0;
        int contadorTotal = 0;
        double mediaAlturaFeminina = 0;
        double altura = -1;

        while (altura != 0) {
            System.out.print("Digite a altura (ou 0 para encerrar): ");
            altura = scan.nextDouble();
            alturaTotal += altura;

            if (altura != 0) {
                contadorTotal++;
            } else {
                break;
            }

            System.out.print("Digite o gênero (M/F/O): ");
            genero = scan.next().charAt(0);

            if (genero == 'F' || genero == 'f') {
            somaAlturaFeminina += altura;
            contadorFeminino++;
                
            }
        }

        if (contadorFeminino > 0) {
            mediaAlturaFeminina = somaAlturaFeminina / contadorFeminino;
        }

        System.out.println("Média da altura feminina: " + String.format("%.2f", mediaAlturaFeminina));
        System.out.println("Média da altura geral: " + String.format("%.2f", alturaTotal / contadorTotal));
        scan.close();
    }
}

    
