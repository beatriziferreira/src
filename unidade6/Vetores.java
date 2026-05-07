package unidade6;

public class Vetores {
    public static void main(String[] args) {
        double[] notas = new double[10];
        notas[0] = 9.5;
        notas[1] = 10.0;
        notas[2] = 8.0;
        notas[3] = 7.5; 
        notas[4] = 6.0;
        
        for (int idx = 5 ; idx < notas.length ; idx++) {
        notas[idx] = 10.0;
        }

        for (int i = 0 ; i < notas.length ; i++){
            System.out.println("Nota [ " + i + " ]: " + notas[i]);
        }

    }
}
