package Unidade5;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        // Exemplo de uso do for para calcular o faturamento de um lava-rápido
        System.out.println("Insira a quantidade de carros: ");
        Scanner scan = new Scanner (System.in);
        int quantidadeCarros = scan.nextInt();
        double valorLavagem = 50;
        double valorTotal = 0;
        
        for (int i = 0; i < quantidadeCarros; i++) {
            valorTotal += valorLavagem;
        }

        System.out.println("Faturamento do dia: R$ " + valorTotal);

        for (int i = quantidadeCarros; i > 0; i--) {
            System.out.println("Carro " + (i) + " lavado."); 
        } 
       

        

        scan.close();
    }
}