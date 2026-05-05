package Unidade5;

public class Ex11 {
    public static void main(String[] args) {

    int biscoitos = 0;

    for (int i = 1; i <= 16; i++) {
        if (i==1) {
            biscoitos = 1;
        } else {
            biscoitos *= 3;
        }
    } System.out.println("Total de biscoitos quebrados: " + biscoitos);
    }
}