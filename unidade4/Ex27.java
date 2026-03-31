package unidade4;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Chegada (HH MM): ");
        int hc = sc.nextInt();
        int mc = sc.nextInt();

        System.out.print("Saída (HH MM): ");
        int hs = sc.nextInt();
        int ms = sc.nextInt();

        
        if (hc < 0 || hc > 23 || hs < 0 || hs > 23 ||
            mc < 0 || mc > 59 || ms < 0 || ms > 59) {
            System.out.println("Horário inválido!");
        }

        int chegada = hc * 60 + mc;
        int saida = hs * 60 + ms;

        if (saida <= chegada) {
            System.out.println("Saída inválida!");
        }

        int tempo = saida - chegada;

        int horas = tempo / 60;
        int minutos = tempo % 60;

        int horasCobradas;

        
        switch (minutos >= 30 ? 1 : 0) {
            case 1:
                horasCobradas = horas + 1;
                break;
            default:
                horasCobradas = horas;
        }

        if (horasCobradas == 0) {
            horasCobradas = 1;
        }

        double total = horasCobradas * 5.0;

        System.out.println("Tempo: " + horas + "h " + minutos + "min");
        System.out.println("Horas cobradas: " + horasCobradas);
        System.out.println("Valor: R$ " + total);

        sc.close();
    }
}
    

