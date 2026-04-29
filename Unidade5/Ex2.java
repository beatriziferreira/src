package Unidade5;

public class Ex2 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 ==0) {
                somaPares += i;
            }
            if (i % 2 !=0) {
                somaImpares += i;
            }
        }
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}

            
            
        



