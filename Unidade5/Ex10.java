package Unidade5;

public class Ex10 {

    public static void main(String[] args) {

        int encontrados = 0;
        int numero = 0;

        while (encontrados < 10) {
            String str = String.valueOf(numero);

            
            if (str.length() % 2 == 0) {

                int meio = str.length() / 2;

                String parte1 = str.substring(0, meio);
                String parte2 = str.substring(meio);

                int num1 = Integer.parseInt(parte1);
                int num2 = Integer.parseInt(parte2);

                int soma = num1 + num2;

                if (soma * soma == numero) {
                    System.out.println(numero);
                    encontrados++;
                }
            }

            numero++;
        }
    }
}