package unidade4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma letra: ");
        char letra = scan.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("É vogal!");
        } else {
            System.out.println("É consoante!");
        }
        scan.close();
        
    }
}
