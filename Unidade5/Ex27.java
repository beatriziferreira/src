package Unidade5;
import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diaMaiorProd = 0; 
        int pecasMaiorProd = 0;
        int quantidadePecas = 0;
        int funcionario = 1;
        double valoRecebido = 0;
        String periodo = "";

        while (funcionario == 1){
            System.out.println("Informe o dia do mês: ");
            int diaMes = scan.nextInt();
            while (diaMes < 1 || diaMes > 30) {
                System.out.println("Dia inválido");
                System.out.println("Tente novamente: ");
                diaMes = scan.nextInt();
            }
            System.out.println("Informe quantas peças foram produzidas na manhã: ");
            int pecasManha = scan.nextInt();

            System.out.println("Informe quantas peças foram produzidas na manhã: ");
            int pecasTarde = scan.nextInt();

            if (pecasManha > pecasTarde) {
                periodo = "Manhã";
            } else {
                periodo = "tarde";
            }

             
        }   




    }
}
