package unidade4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Insira uma letra: ");  
        Scanner scan = new Scanner(System.in);
        char letra = scan.next().charAt(0);
        letra = Character.toUpperCase(letra);
        scan.close();
        if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'I') {
            System.out.println("Não Informado");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
