package Unidade5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        int termo = 8;
        int soma = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                termo += 2;
            } else {
                if (i == 1) {
                    termo = 8;
                } else {
                    termo = (termo - 2) * 2;
                }
            }
            soma += termo;
        } System.out.println("Soma: " + soma);

        sc.close();
    }
}

