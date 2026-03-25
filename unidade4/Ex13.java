package unidade4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--VOCÊ ESTÁ EM UM JOGO DE TRUCO--");
        System.out.println("OBS: 11 = Valete / 12 = Dama / 13 = Rei");
        
        System.out.println("Escreva o valor da primeira carta: ");
        int valor1 = scan.nextInt();

        System.out.println("Escreva o valor da segunda carta: ");
        int valor2 = scan.nextInt();
        
        System.out.println("Escreva o valor da terceira carta: ");
        int valor3 = scan.nextInt();

        int cartasBoas = 0;

        if (valor1 == 1 || valor1 == 2 || valor1 == 3) {
            cartasBoas = cartasBoas + 1;
           
            if (valor2 == 1 || valor2 == 2 || valor2 == 3) {
                cartasBoas = cartasBoas + 1; 
           
                if (valor3 == 1 || valor3 == 2 || valor3 == 3){
                    cartasBoas = cartasBoas + 1;
                }
            }
        }
        
        if (cartasBoas == 1) {
            System.out.println("TRUCO!");
        } else if (cartasBoas == 2) {
            System.out.println("SEIS!");
        } else if (cartasBoas == 3) {
            System.out.println("NOVE!");}
        }
    }

