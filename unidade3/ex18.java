import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        System.out.println("Informe a distância percorrida(em km): ");
        Scanner teclado = new Scanner(System.in);
        
        float distância = teclado.nextFloat();

        System.out.println("Informe o tempo(em min): ");
        float minutos = teclado.nextFloat();

        float tempoHoras = minutos / 60;
        float velMedia = distância / tempoHoras;
        float ritmo = minutos / distância;

        System.out.println("O tempo em horas foi de " + tempoHoras);
        System.out.println("A velocidade média foi de " + velMedia + " km/h");
        System.out.println("O ritmo médio foi de " + ritmo + " min/km");

        teclado.close();

    }
    
}
