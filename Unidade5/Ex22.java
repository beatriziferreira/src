package Unidade5;

public class Ex22 {
    public static void main(String[] args) {
        double salario = 2000;
        double aumento = 0.015;
        int anos = 0;

        while (1996 + anos < 2026) {
            salario += salario * aumento;
            anos++;
        }
        System.out.println("Salário em 2026: " + String.format("%.2f", salario) + " reais");
    }
}
