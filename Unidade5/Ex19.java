package Unidade5;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        double valorCompra = 1;
        double valorDesconto = 0;
        double totalRecebido = 0;
        double valorFinal = 0;
        Scanner sc = new Scanner(System.in);
        
        
        while (valorCompra !=0) {
           
            System.out.print("Digite o valor da compra (ou 0 para encerrar): ");
            valorCompra = sc.nextDouble();
            if (valorCompra > 0) {
                if (valorCompra > 500) {
                    valorDesconto = valorCompra * 0.2;
                } else if (valorCompra <= 500) {
                    valorDesconto = valorCompra * 0.15;
                }
            
            if (valorCompra != 0) {
                valorFinal = valorCompra - valorDesconto;
            }
            System.out.println("Valor final com desconto: " + valorFinal);
            totalRecebido += valorFinal;
        }
    }
        System.out.println("Total recebido: " + totalRecebido);
        sc.close();
    }
}
