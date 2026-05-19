package unidade6;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scan.nextInt();
        double[] vetor = new double[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor real: ");
            vetor[i] = scan.nextDouble();
        }

        System.out.println("Insira outro valor real: ");
        double valor = scan.nextDouble();

        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
            }
        }

        System.out.println("O valor existe no vetor? " + encontrado);

        scan.close();
    }
}
