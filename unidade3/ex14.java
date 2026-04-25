package unidade3;
import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        System.out.println("Digite a distância percorrida(em km): ");
        Scanner teclado = new Scanner (System.in);
        float distancia = teclado.nextFloat();
        System.out.println("Informe o tempo percorrido(em horas): ");
        float horas = teclado.nextFloat();
        float velMedia = distancia / horas;
        float combustivel = distancia / 12;
        System.out.println("Sua velocidade média foi de " + velMedia + " km/h e a quantidade de combustível usada foi de " + combustivel + " litros");
        teclado.close();
    }
}