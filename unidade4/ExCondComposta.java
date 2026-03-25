package unidade4;

import java.util.Scanner;


public class ExCondComposta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do pedido:");
        float valorPedido = sc.nextFloat();

        System.out.println("Informe se possui clube (true or false): ");
        boolean clube = sc.nextBoolean();

        System.out.println("Informe a hora do pedido: ");
        int horaPedido = sc.nextInt();
        boolean horaDesconto = horaPedido >= 17 && horaPedido <= 18;
       
        if ((valorPedido > 40 && clube) || horaDesconto) {
            System.out.println("frete grátis!");
        } else if (valorPedido > 40 || clube) {
            System.out.println("Frete com desconto!");
        } else {
            System.out.println("Frete normal!");
        }
        sc.close();
    }
}

/*  --LEGENDA--
   -> O símbolo && significa "E"
   -> O símbolo || significa "OU"
   -> O símbolo ! significa negação
*/