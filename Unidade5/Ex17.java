package Unidade5;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroinscricao = 1;
        double altura = 0;
        double alturaBaixa = 0;
        double alturaAlta = 0;
        int numeroinscricaoBaixa = 0;
        int numeroinscricaoAlta = 0;
        double somaAltura = 0;
        double mediaAltura = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um número de inscrição (ou 0 para sair): ");
            numeroinscricao = sc.nextInt();

            if (numeroinscricao == 0) {
                break;
            }
            
            System.out.print("Digite a altura da pessoa: ");
            altura = sc.nextDouble();
            somaAltura += altura;
            contador++;

            if (alturaBaixa == 0 || altura < alturaBaixa) {
                alturaBaixa = altura;
                numeroinscricaoBaixa = numeroinscricao;
            }
            if (alturaAlta == 0 || altura > alturaAlta) {
                alturaAlta = altura;
                numeroinscricaoAlta = numeroinscricao;
            }
        }
        if (contador > 0) {
            mediaAltura = somaAltura / contador;
        }
        System.out.println("Atleta mais baixo: " + alturaBaixa + " (Inscrição: " + numeroinscricaoBaixa + ")");
        System.out.println("Atleta mais alto: " + alturaAlta + " (Inscrição: " + numeroinscricaoAlta + ")"  );
        System.out.println("Média das alturas: " + mediaAltura);
        sc.close();
}
}

