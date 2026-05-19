package unidade6;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] rapaz = new String[5];
        String[] moca = new String[5];
        int indice = 0;

        System.out.println("-- ÍNDICE DE AFINIDADE --");
        System.out.println("OBS: responda apenas com SIM / NAO / IND (indiferente) ");

        System.out.println("1 - Gosta de música sertaneja?");
        System.out.println("Resposta do rapaz: ");
        rapaz[0] = scan.nextLine();
        System.out.println("Resposta da moça: ");
        moca[0] = scan.nextLine();

        System.out.println(" ");

        System.out.println("2 - Gosta de futebol?");
        System.out.println("Resposta do rapaz: ");
        rapaz[1] = scan.nextLine();
        System.out.println("Resposta da moça: ");
        moca[1] = scan.nextLine();

        System.out.println(" ");

        System.out.println("3 - Gosta de seriados?");
        System.out.println("Resposta do rapaz: ");
        rapaz[2] = scan.nextLine();
        System.out.println("Resposta da moça: ");
        moca[2] = scan.nextLine();

        System.out.println(" ");

        System.out.println("4 - Gosta de redes sociais?");
        System.out.println("Resposta do rapaz: ");
        rapaz[3] = scan.nextLine();
        System.out.println("Resposta da moça: ");
        moca[3] = scan.nextLine();

        System.out.println(" ");

        System.out.println("5 - Gosta da Oktoberfest?");
        System.out.println("Resposta do rapaz: ");
        rapaz[4] = scan.nextLine();
        System.out.println("Resposta da moça: ");
        moca[4] = scan.nextLine();

        for (int i = 0; i < rapaz.length; i++) {
            if (rapaz[i].equalsIgnoreCase("SIM") && moca[i].equalsIgnoreCase("SIM")){
                indice += 3;
            } else if (rapaz[i].equalsIgnoreCase("IND") && (moca[i].equalsIgnoreCase("SIM") || moca[i].equalsIgnoreCase("NAO"))){
                indice += 1;
            } else if (moca[i].equalsIgnoreCase("IND") && (rapaz[i].equalsIgnoreCase("SIM") || rapaz[i].equalsIgnoreCase("NAO"))){
                indice += 1;
            } else if (rapaz[i].equalsIgnoreCase("SIM") && moca[i].equalsIgnoreCase("NAO")){
                indice -= 2;
            } else if (rapaz[i].equalsIgnoreCase("NAO") && moca[i].equalsIgnoreCase("SIM")){
                indice -= 2;
            }
        }

        System.out.println("Índice de afinidade: " + indice);

        if (indice >= 15){
            System.out.println("Casem!");
        } else if (indice >= 10 && indice < 15){
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (indice >= 5 && indice < 10){
            System.out.println("Talvez não dá certo :(");
        } else if (indice >= 0 && indice < 5){
            System.out.println("Vale um encontro.");
        } else {
            System.out.println("Melhor não perder tempo");
        }

        scan.close();


    }
}
