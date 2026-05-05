package Unidade5;

public class Ex32 {
    public static void main(String[] args) {
        int primeiroDia = 0;
        int quantidadeDias = 0;
        System.out.println("CALENDARIO");
        if (quantidadeDias <= 30) {
            while (quantidadeDias <= 30) {
                for (int i = 1; i <= quantidadeDias; i++) {
                    if (i == 1) {
                        primeiroDia = 1;
                    } else {
                        primeiroDia = (primeiroDia + 1) % 7;
                    } System.out.print(i + " ");
                    if (primeiroDia == 0) {
                        System.out.println();
                    }
                } 
        }

    }
    
}}