package Unidade5;

public class Exemplo2 {
    public static void main(String[] args) {
        // Exemplo de uso do while 
        System.out.println("Informe o seu nome de usuário: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String nomeUsuario = scan.nextLine();
        nomeUsuario = nomeUsuario.toLowerCase();

        while(!nomeUsuario.equals("beatriz")) {
            System.out.println("Usuário incorreto. Tente novamente: ");
            nomeUsuario = scan.nextLine();
        }
        System.out.println("Bem-vindo à Calculadora, " + nomeUsuario + "!");
        System.out.println("--Menu de Operações--");
        int menu;
        // Exemplo de uso do do-while
        do {
            System.out.println("Selecione uma opção (0 para sair): ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");  
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            menu = scan.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Você selecionou Soma.");
                        System.out.println("Informe o primeiro número: ");
                        int a = scan.nextInt();
                        System.out.println("Informe o segundo número: ");
                        int b = scan.nextInt();
                        System.out.println("Resultado: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Você selecionou Subtração.");  
                        System.out.println("Informe o primeiro número: ");
                        int c = scan.nextInt();
                        System.out.println("Informe o segundo número: ");
                        int d = scan.nextInt();
                        System.out.println("Resultado: " + (c - d));
                        break;
                    case 3:
                        System.out.println("Você selecionou Multiplicação.");
                        System.out.println("Informe o primeiro número: ");
                        int e = scan.nextInt();
                        System.out.println("Informe o segundo número: ");
                        int f = scan.nextInt();
                        System.out.println("Resultado: " + (e * f));
                        break;
                    case 4:
                        System.out.println("Você selecionou Divisão.");
                        System.out.println("Informe o primeiro número: ");
                        double g = scan.nextDouble();
                        System.out.println("Informe o segundo número: ");
                        double h = scan.nextDouble();
                        if (h != 0) {
                            System.out.println("Resultado: " + String.format("%.2f", g / h));
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                        break;
                 };
            
        } while (menu != 0); 

        System.out.println("--Tabuada--");
        System.out.println("Informe um número: ");
        int n = scan.nextInt();
        int limite = 10;
        int contador = 0;
        System.out.println("Tabuada de " + n + ":");
        while (contador < limite) {
            System.out.println(n + " x " + contador + " = " + (n * contador));
            contador++;
        }
        scan.close();
    }
}
