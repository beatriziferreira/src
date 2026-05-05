package Unidade5;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        double precoCompra, precoVenda = 0;
        double lucroPercentual = 0;
        double lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;
        double totalCompra = 0;
        double totalVenda = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira o nome da mercadoria " + i + ":");
            nome = sc.nextLine();
            System.out.println("Insira o preço de compra da mercadoria " + i + ":");
            precoCompra = sc.nextDouble();
            System.out.println("Insira o preço de venda da mercadoria " + i + ":");
            precoVenda = sc.nextDouble();
            sc.nextLine(); 
            lucroPercentual = (precoVenda - precoCompra) / precoCompra * 100;

            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
            totalCompra += precoCompra;
            totalVenda += precoVenda;
        }
        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Lucro total: " + String.format("%.2f", lucroTotal) + "%");
        System.out.println("Valor total de compras: " + String.format("%.2f", totalCompra));
        System.out.println("Valor total de vendas: " + String.format("%.2f", totalVenda));

        System.out.println("Mercadorias com lucro menor que 10%: " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro maior que 20%: " + lucroMaior20);
        sc.close();
    }
}
