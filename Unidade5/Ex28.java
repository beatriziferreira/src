package Unidade5;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banda1 = 0 , banda2 = 0 , banda3 = 0 , banda4 = 0;
        int maiorVotos = 0 , totalVotos = 0;

        char novoVoto = 's';

        while (novoVoto == 's'){
            System.out.println("escolha a sua banda favorita: ");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");

            int bandaFav = scan.nextInt();

            switch (bandaFav) {
                case 1:
                    banda1 ++;
                    break;
                case 2:
                    banda2 ++;
                    break;
                case 3:
                    banda3 ++;
                    break;
                case 4:
                    banda4 ++;
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            } 
            System.out.println("Novo voto? s/n");
            novoVoto = scan.next().charAt(0);
            scan.nextLine();
        } 

        totalVotos = banda1 + banda2 + banda3 + banda4;
        double percBanda1 = (banda1 * 100 / totalVotos);
        double percBanda2 = (banda2 * 100 / totalVotos);
        double percBanda3 = (banda3 * 100 / totalVotos);
        double percBanda4 = (banda4 * 100 / totalVotos);

        if (banda1 >= banda2 && banda1 >= banda3 && banda1 >= banda4){
            maiorVotos = banda1;
        } else if (banda2 >= banda1 && banda2 >= banda3 && banda2 >= banda4){
            maiorVotos = banda2;
        } else if (banda3 >= banda1 && banda3 >= banda2 && banda3 >= banda4){
            maiorVotos = banda3;
        } else if (banda4 >= banda1 && banda4 >= banda3 && banda4 >= banda2){
            maiorVotos = banda4;
        }

        String bandaVencedora = "";
        if (maiorVotos == banda1) {
            bandaVencedora = "Nenhum de Nós";
        } else if (maiorVotos == banda2) {
            bandaVencedora = "CPM22";
        } else if (maiorVotos == banda3) {
            bandaVencedora = "Skank";
        } else if (maiorVotos == banda4) {
            bandaVencedora = "Jota Quest";
        }

        System.out.println("Nenhum de Nós: " + banda1);
        System.out.println("CPM22: " + banda2);
        System.out.println("Skank: " + banda3);
        System.out.println("Jota Quest: " + banda4);

        System.out.println("Nenhum de Nós: " + percBanda1);
        System.out.println("CPM22: " + percBanda2);
        System.out.println("Skank: " + percBanda3);
        System.out.println("Jota Quest: " + percBanda4);

        System.out.println("Banda vencedora: " + bandaVencedora);

        scan.close();

    }
}
