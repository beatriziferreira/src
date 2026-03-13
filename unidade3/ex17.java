import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        System.out.println("Informe quantas camisetas o cliente comprou(acima de 3 apenas):" );
        Scanner teclado = new Scanner (System.in);
        
        int camisetas = teclado.nextInt();

        double valorTotal = camisetas * 35;
        double desconto = valorTotal * 0.1;
        double valorFinal =  valorTotal - desconto;

        System.out.println("Valor total: " + valorTotal);
        System.out.println("Valor desconto: " + desconto);
        System.out.println("Valor final: " + valorFinal);

        teclado.close();
 
        } 
    }
