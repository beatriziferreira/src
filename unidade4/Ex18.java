package unidade4;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Insira o dia do vencimento: ");
        int diaVencimento = scan.nextInt();
        
        System.out.println("Insira o dia do pagamento : ");
        int diaPagamento = scan.nextInt();
       
        System.out.println("Insira o valor da prestação: ");
        double valorPrestacao = scan.nextDouble();
        scan.close();
        double valorFinal;

        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.9;
            System.out.println("Pagamento em dia. Desconto de 10% aplicado.");
        } 
        else if (diaPagamento <= diaVencimento + 5) {
            valorFinal = valorPrestacao;
            System.out.println("Pagamento com atraso de até 5 dias. Sem desconto.");
        } 
        else {
            int diasAtraso = diaPagamento - diaVencimento;
            double multa = diasAtraso * 0.02;
            valorFinal = valorPrestacao * (1 + multa);
            System.out.println("Pagamento com mais de 5 dias de atraso.");
            System.out.println("Multa de 2% ao dia aplicada por " + diasAtraso + " dias de atraso.");
        }

        System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);

        scan.close();
    }
}