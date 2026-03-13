import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        System.out.println("Digite A NOTA 1: ");
        Scanner teclado = new Scanner (System.in);
        float nota1 = teclado.nextFloat() * 5;
        System.out.println("Digite A NOTA 2: ");
        float nota2 = teclado.nextFloat() * 3;
        System.out.println("Digite A NOTA 3: ");
        float nota3 = teclado.nextFloat() * 2;
        float mediaFinal = (nota1 + nota2 + nota3) / 10;
        System.out.println("Media final: " + mediaFinal);
        teclado.close();




        
    }
    
}
