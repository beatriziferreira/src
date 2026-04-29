package Unidade5;

public class Ex4{
    public static void main(String[] args) {
    double numerador = 1;
    double denominador = 1;
    double soma = 0;
    for (int i = 1; i <= 20;i++) {
            numerador +=2;  
            denominador =i*(i+1);
            soma += numerador/denominador;
    }
    System.out.println("Soma: " + soma);
}
}
