import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.nextLine();
        System.out.println("Informe quantas horas trabalha por mes: ");
        int horas = teclado.nextInt();
        System.out.println("Informe quantos dependentes possui: ");
        int dep = teclado.nextInt();
        double salTrabalho = horas * 10;
        double salFamilia = dep * 60;
        
        double salBruto = salFamilia + salTrabalho;

        double inss = salTrabalho * 0.085;
        double imposto = salTrabalho * 0.05;

        double salLiquido = salBruto - inss - imposto;

        System.out.println("Olá " + nome + ", seu salário bruto é de " + salBruto + " RS e seu salário líquido é de " + salLiquido + " RS");
        teclado.close();
    }
}
