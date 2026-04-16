package unidade4;

public class Tabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 20; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
