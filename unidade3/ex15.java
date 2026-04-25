package unidade3;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        System.out.println("Insira um número de 3 dígitos: ");
        Scanner teclado = new Scanner (System.in);
        int num = teclado.nextInt();
        int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;
        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
        teclado.close();
        
    }
}
