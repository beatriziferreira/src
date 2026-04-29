package Unidade5;

public class Ex3{
    public static void main(String[] args) {
    
    double numerador = 1;
    double denominador = 0;
    double soma = 0;
    for (int i = 1; i <= 100; i++) {
            denominador = i;
            soma += numerador/denominador;
    }
    System.out.println("Soma: " + soma);
}
}


