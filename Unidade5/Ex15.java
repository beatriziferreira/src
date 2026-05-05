package Unidade5;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        String nome = "";
        double nota1 = 0;
        double nota2 = 0;
        double media = 0;
        Scanner scan = new Scanner(System.in);
        while (!nome.equals("fim")) {
            System.out.print("Digite um nome (ou 'fim' para encerrar): ");
            nome = scan.nextLine();
            System.out.println("Informe a nota da prova 1: ");
            nota1 = scan.nextDouble();
            System.out.println("Informe a nota da prova 2: ");
            nota2 = scan.nextDouble();
            scan.nextLine();
            media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno " + nome + ": " + media);
        }
        scan.close();
    }
}
