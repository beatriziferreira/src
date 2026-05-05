package Unidade5;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        double salario = 0.0;
        double totalVendas = 0.0;
        int produtosVendidos = 0;
        double valorProduto = 0.0;
        double comissao = 0.30;
        char resposta = 's';

        while (resposta == 's' || resposta == 'S') {
            System.out.print("Digite o nome do vendedor: ");
            nome = scanner.nextLine();
            if (resposta == 'n' || resposta == 'N') {
                break;
            } 
            System.out.print("Digite o salário fixo do vendedor: ");
            salario = scanner.nextDouble();

            System.out.print("Digite a quantidade de produtos vendidos: ");
            produtosVendidos = scanner.nextInt();

            System.out.print("Digite o valor de cada produto vendido: ");
            valorProduto = scanner.nextDouble();

            totalVendas = produtosVendidos * valorProduto;
            double salarioFinal = salario + (totalVendas * comissao);
            System.out.println("\n--- Relatório ---");
            System.out.println("Salário final do vendedor " + nome + ": " + String.format("%.2f", salarioFinal) + " reais");
            System.out.println("Total de vendas: " + String.format("%.2f", totalVendas) + " reais");
            System.out.println("Deseja informar outro vendedor? (Digite 'n' para encerrar ou 's' para continuar): ");
            resposta = scanner.next().charAt(0);
        }
        
        scanner.close();}
            
        
        }
        

    

